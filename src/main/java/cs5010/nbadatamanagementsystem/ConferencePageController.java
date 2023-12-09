package cs5010.nbadatamanagementsystem;

/**
 * Represents the controller interface for a conference page in the NBA Data Management System.
 * This interface defines methods for initializing the page and handling user interaction,
 * such as navigating back to the main page.
 */
public interface ConferencePageController {

    /**
     * Initializes the conference page. This method is meant to set up the initial state of
     * the page, such as loading data and configuring UI components.
     */
    void initialize();

    /**
     * Handles the event when the "Back to Main Page" button is clicked.
     * This method should implement the logic to navigate back to the main page of the application.
     *
     * @throws Exception if an error occurs during the process of handling the event.
     */
    void handleBackToMainPageClick() throws Exception;
}
