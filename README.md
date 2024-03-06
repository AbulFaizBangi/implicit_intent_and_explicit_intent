
## Project Overview

The application consists of two main activities:

1. **MainActivity**: The entry point of the application. It contains buttons to trigger Implicit and Explicit Intents.
2. **ExperimentsActivity**: Displays information about practical experiments.

### Implicit Intent

An Implicit Intent is used to perform an action by asking the system to find an appropriate component that can handle the request. In this project, the Implicit Intent is used to open a syllabus link in the browser.

### Explicit Intent

An Explicit Intent is used to start a specific component, such as an activity, by specifying the component's class name. In this project, the Explicit Intent is used to navigate from the MainActivity to the ExperimentsActivity.

## Project Files

- **MainActivity.java**: Contains the logic for handling button clicks and initiating Implicit and Explicit Intents.
- **activity_main.xml**: The layout file for MainActivity, including buttons for triggering the intents.
- **ExperimentsActivity.java**: The activity that displays information about practical experiments.
- **activity_experiments.xml**: The layout file for ExperimentsActivity.

## Usage

1. Clone or download the repository.
2. Open the project in Android Studio.
3. Run the application on an emulator or a physical device.
4. Click on the "Syllabus Link" button to open a syllabus in the browser using an Implicit Intent.
5. Click on the "Practical Experiments" button to navigate to the ExperimentsActivity using an Explicit Intent.

## Advantages of Using Intents

- **Flexibility**: Implicit Intents allow your app to interact with other apps without knowing their component names.
- **Modularity**: Explicit Intents enable your app to start components within its own package or other apps, promoting modularity.
- **Security**: By using Explicit Intents, you can ensure that your app only communicates with components it trusts.

## Screenshots

### Main Screen
![Main Screen](![Screenshot 2024-03-06 at 7 28 59 PM](https://github.com/AbulFaizBangi/implicit_intent_and_explicit_intent/assets/140591784/3f9b5949-1519-4c32-b362-193af8821947)
)

This is the main screen of the app, where users can access the syllabus and practical experiments information.


### Implicit Intent Example
![Implicit Intent Example]![Screenshot 2024-03-06 at 7 31 24 PM](https://github.com/AbulFaizBangi/implicit_intent_and_explicit_intent/assets/140591784/58276ff7-6f34-4288-a84e-18aa73a0f3c7)

This project demonstrates the use of Implicit and Explicit Intents in Android development. It showcases how to open a URL in a browser using an Implicit Intent and navigate to a new activity using an Explicit Intent.
An example of using an Implicit Intent to open a syllabus link in the browser.


### Explicit Intent Example
![Experiments Activity]![Screenshot 2024-03-06 at 7 32 10 PM](https://github.com/AbulFaizBangi/implicit_intent_and_explicit_intent/assets/140591784/66aa742c-dda9-4a56-b936-fbcb9010cc72)


This screen displays detailed information about practical experiments.



## Contributing

Contributions are welcome. Please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
