package org.example.CourseProgram;

import java.util.*;
public class courseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 4 Course objects
        Course[] courseArray = new Course[4];

        // Input loop to read course details from user
        System.out.println("Enter details for 4 courses:");
        for (int courseIndex = 0; courseIndex < 4; courseIndex++) {
            // Read course details one by one
            int courseId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after integer input

            String courseName = scanner.nextLine();
            String courseAdmin = scanner.nextLine();

            int quizQuestions = scanner.nextInt();
            scanner.nextLine(); // Consume newline after integer

            int handsOnExercises = scanner.nextInt();
            scanner.nextLine(); // Consume newline after integer

            // Create new Course object and add to array
            courseArray[courseIndex] = new Course(courseId, courseName, courseAdmin,
                    quizQuestions, handsOnExercises);
        }

        // Read search parameters
        String adminToSearch = scanner.nextLine();
        int handsOnLimit = scanner.nextInt();

        // Call method to find average quiz questions by admin
        int averageQuizScore = findAvgOfQuizByAdmin(courseArray, adminToSearch);

        // Display result for average quiz calculation
        if (averageQuizScore != 0) {
            System.out.println(averageQuizScore);
        } else {
            System.out.println("No Course found");
        }

        // Call method to sort courses by hands-on exercises
        Course[] sortedCourses = sortCourseByHandsOn(courseArray, handsOnLimit);

        // Display result for sorted courses
        if (sortedCourses != null) {
            // Print course names from sorted array
            for (int i = 0; i < sortedCourses.length; i++) {
                System.out.println(sortedCourses[i].getCourseName());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }

        scanner.close();
    }

    /**
     * Method to find average of quiz questions for courses administered by a specific admin
     * @param courseArray - Array of Course objects to search through
     * @param adminName - Name of the admin to search for
     * @return Average quiz questions as integer, or 0 if no courses found
     */
    public static int findAvgOfQuizByAdmin(Course[] courseArray, String adminName) {
        int totalQuizQuestions = 0;  // Sum of all quiz questions
        int courseCount = 0;         // Number of courses found for the admin

        // Loop through all courses to find matches
        for (int i = 0; i < courseArray.length; i++) {
            // Check if current course admin matches the search admin (case-insensitive)
            if (courseArray[i].getCourseAdmin().equalsIgnoreCase(adminName)) {
                totalQuizQuestions += courseArray[i].getQuizQuestions();
                courseCount++;
            }
        }

        // Calculate and return average if courses were found
        if (courseCount > 0) {
            int average = totalQuizQuestions / courseCount;
            return average;
        } else {
            return 0; // No courses found for the admin
        }
    }

    /**
     * Method to sort courses by hands-on exercises in ascending order
     * Only includes courses with hands-on exercises less than the given limit
     * @param courseArray - Array of Course objects to filter and sort
     * @param handsOnLimit - Maximum hands-on exercises limit (exclusive)
     * @return Sorted array of Course objects, or null if no courses qualify
     */
    public static Course[] sortCourseByHandsOn(Course[] courseArray, int handsOnLimit) {
        // Start with empty array and dynamically grow it
        Course[] filteredCourses = new Course[0];

        // Filter courses: include only those with hands-on < limit
        for (int i = 0; i < courseArray.length; i++) {
            if (courseArray[i].getHandsOnExercises() < handsOnLimit) {
                // Expand array size by 1 and add the qualifying course
                filteredCourses = Arrays.copyOf(filteredCourses, filteredCourses.length + 1);
                filteredCourses[filteredCourses.length - 1] = courseArray[i];
            }
        }

        // Sort the filtered courses using bubble sort (ascending order by hands-on)
        Course tempCourse; // Temporary variable for swapping
        for (int i = 0; i < filteredCourses.length; i++) {
            for (int j = i + 1; j < filteredCourses.length; j++) {
                // Compare hands-on exercises and swap if needed
                if (filteredCourses[i].getHandsOnExercises() > filteredCourses[j].getHandsOnExercises()) {
                    // Swap courses
                    tempCourse = filteredCourses[i];
                    filteredCourses[i] = filteredCourses[j];
                    filteredCourses[j] = tempCourse;
                }
            }
        }

        // Return sorted array if courses were found, otherwise return null
        if (filteredCourses.length > 0) {
            return filteredCourses;
        } else {
            return null; // No courses found with hands-on < limit
        }
    }
}

/**
 * Course class representing a course with its properties
 * All attributes are private with public getter and setter methods
 */
class Course {
    // Private attributes
    private int courseId;           // Unique identifier for the course
    private int quizQuestions;      // Number of quiz questions
    private int handsOnExercises;   // Number of hands-on exercises
    private String courseName;      // Name of the course
    private String courseAdmin;     // Administrator of the course

    /**
     * Parameterized constructor to create a Course object
     * @param courseId - Unique course identifier
     * @param courseName - Name of the course
     * @param courseAdmin - Administrator name
     * @param quizQuestions - Number of quiz questions
     * @param handsOnExercises - Number of hands-on exercises
     */
    public Course(int courseId, String courseName, String courseAdmin,
                  int quizQuestions, int handsOnExercises) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quizQuestions = quizQuestions;
        this.handsOnExercises = handsOnExercises;
    }

    // Getter methods to access private attributes
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuizQuestions() {
        return quizQuestions;
    }

    public int getHandsOnExercises() {
        return handsOnExercises;
    }

    // Setter methods to modify private attributes
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public void setQuizQuestions(int quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public void setHandsOnExercises(int handsOnExercises) {
        this.handsOnExercises = handsOnExercises;
    }
}