import java.util.*;

public class SuperlistOrganizer {

    static Map<String, Set<String>> superlist = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
		System.out.println("Welcome to the Dynamic Superlist Organizer!");
        while (true) {
            System.out.print("Enter category name (or type 'done'): ");
            String category = scanner.nextLine().trim();
            if (category.equalsIgnoreCase("done")) break;

            category = capitalize(category);

            System.out.print("Enter tasks (comma-separated): ");
            String[] rawTasks = scanner.nextLine().split(",");

            for (int i = 0; i < rawTasks.length; i++) {
                rawTasks[i] = capitalize(rawTasks[i].trim());
            }

            addTasks(category, rawTasks);
        }

        deleteTasks(); // Ask user if they want to remove any tasks
        displaySuperlist(); // Final output
    }

    static void addTasks(String category, String... tasks) {
        superlist.putIfAbsent(category, new TreeSet<>()); // Auto-sorting
        Set<String> taskSet = superlist.get(category);

        for (String task : tasks) {
            if (!task.isEmpty()) {
                taskSet.add(task); // Set avoids duplicates
            }
        }
    }

    static void deleteTasks() {
        System.out.print("\nWould you like to delete any tasks? (yes/no): ");
        String response = scanner.nextLine().trim();

        while (response.equalsIgnoreCase("yes")) {
            System.out.println("\nCurrent Categories:");
            for (String category : superlist.keySet()) {
                System.out.println("- " + category);
            }

            System.out.print("Enter the category from which to delete a task: ");
            String category = capitalize(scanner.nextLine().trim());

            if (superlist.containsKey(category)) {
                List<String> tasks = new ArrayList<>(superlist.get(category));
                if (tasks.isEmpty()) {
                    System.out.println("No tasks in that category.");
                } else {
                    System.out.println("Tasks in " + category + ":");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.printf("[%d] %s\n", i + 1, tasks.get(i));
                    }

                    System.out.print("Enter the number of the task to delete: ");
                    try {
                        int taskNum = Integer.parseInt(scanner.nextLine().trim());
                        if (taskNum >= 1 && taskNum <= tasks.size()) {
                            String removed = tasks.remove(taskNum - 1);
                            superlist.get(category).remove(removed);
                            System.out.println("Task \"" + removed + "\" deleted.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
            } else {
                System.out.println("That category doesn't exist.");
            }

            System.out.print("\nWould you like to delete another task? (yes/no): ");
            response = scanner.nextLine().trim();
        }
    }

    static void displaySuperlist() {
        System.out.println("\nYour Superlist: ");
        StringBuilder sb = new StringBuilder();
        for (String category : superlist.keySet()) {
            sb.append(String.format("Category: %s\n", category));
            for (String task : superlist.get(category)) {
                sb.append(String.format("  - %s\n", task));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
