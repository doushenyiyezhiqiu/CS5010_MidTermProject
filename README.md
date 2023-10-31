Before running the application, you should make sure that you have Java and JavaFX environtment.

This a NBA data management system. You can check NBA team and player statistics in the last season(2022-2023). You can also add or delete player in the player stats as you wish. 

In this program, I use the interface structure. "EasternConferenceController" and "WesternConferenceController" implements "ConferenceController" interface. I also use MVC structure.

The following is I copyed from chatGPT about how to download JavaFX on IDEA:

To set up a JavaFX environment in IntelliJ IDEA, follow these steps:

Install JavaFX SDK:

Download the latest JavaFX SDK from Gluon's JavaFX website.
Extract the downloaded file to a known directory.
Open IntelliJ IDEA:

Start a new project or open an existing one.
Configure JavaFX:

Go to File > Project Structure (Ctrl+Alt+Shift+S).
Under Project, set the Project SDK to your desired JDK.
Click on Libraries, then the + button, then Java.
Navigate to the lib directory inside the extracted JavaFX SDK folder. Select the lib folder and click OK.
Confirm by clicking OK again to add the JavaFX libraries to your project.
Configure VM options:

If you are using Java 11 or newer, you'll need to add VM options to run JavaFX applications.

Go to Run > Edit Configurations.

In the VM options field, add the following:

css
Copy code
--module-path path_to_javafx_sdk/lib --add-modules javafx.controls,javafx.fxml
Replace path_to_javafx_sdk with the actual path to your JavaFX SDK.

Create or Edit JavaFX Application:

Now, you can create a new JavaFX class or edit an existing one.
Ensure that you have imported necessary JavaFX packages at the beginning of your Java class.
JavaFX Plugin (Optional):

IntelliJ IDEA also provides a JavaFX plugin that can help you create JavaFX-specific artifacts like FXML files.
Go to File > Settings (Ctrl+Alt+S) > Plugins.
Search for JavaFX and ensure it's enabled.
Run Your JavaFX Application:

Once you've set up everything, you can run your JavaFX application.
The application should launch without any issues, given that you've set up the SDK and VM options correctly.
That's it! You've set up JavaFX in IntelliJ IDEA.