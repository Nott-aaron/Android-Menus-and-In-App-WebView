# Experiment 8: Android Menus and In-App WebView

Welcome to my repository for **Experiment 8** of the Android Development Lab. This project demonstrates Android Options Menus, Popup Menus, student profile navigation, and an embedded WebView with browser navigation controls.

The application provides a simple dashboard through which users can open student information and browse web pages without leaving the application.

---

## 👨‍💻 Student Details

- **Name:** Spencer Aaron Fernandes
- **USN:** 25MCAR0123
- **Course:** MCA General
- **College:** Jain College, Bangalore
- **Address:** Goa
- **Experiment:** 8

---

## 🎯 Aim

To develop an Android application demonstrating the implementation of Options Menus, Popup Menus, activity navigation, and WebView integration with browser history and navigation controls.

## 📌 Objectives

1. **Options Menu:** Create a menu in the application toolbar to provide navigation and additional actions.
2. **Popup Menu:** Implement a contextual popup menu for quick access to secondary actions.
3. **WebView Integration:** Load web pages inside the Android application using `WebView`.
4. **Web Navigation:** Implement Back, Forward, and Reload controls for browsing web pages.
5. **Activity Navigation:** Navigate between the main dashboard, WebView screen, and student details screen.
6. **Back Button Handling:** Support WebView browsing history when the device Back button is pressed.
7. **User Interface:** Design a clean and user-friendly interface using Android XML layouts and Material-style components.

---

## 📱 Project Overview

The application consists of three primary activities.

### 1. MainActivity

The main dashboard serves as the starting screen of the application.

**Responsibilities:**
- Display the application's home screen.
- Provide access to the Options Menu.
- Display and handle the Popup Menu.
- Navigate to the WebView activity.
- Navigate to the Student Details activity.

### 2. WebViewActivity

This activity provides an embedded web browser inside the application.

**Responsibilities:**
- Load a web page, such as Google.
- Display web content using `WebView`.
- Support browser history.
- Provide Back, Forward, and Reload buttons.
- Handle the device Back button while browsing.
- Display an appropriate message when a page fails to load, if implemented.

### 3. StudentDetailsActivity

This activity displays the student's profile information.

**Responsibilities:**
- Display the student's name.
- Display the USN.
- Display the course and college.
- Display the address.
- Provide a simple profile screen.

---

## 🏗️ Application Architecture and Workflow

The application's navigation follows this general flow:

    Launch Application
            |
            v
       MainActivity
       /          \
      v            v
Options Menu    Popup Menu
|            |
+------+-----+
|
+------+------+
|             |
v             v
WebViewActivity  StudentDetailsActivity
|
v
Load Website
|
v
Back / Forward / Reload
|
v
Continue Browsing

---

## ✨ Features

### 1. Options Menu

The Options Menu provides actions accessible from the application toolbar.

Possible actions include:
- Open Student Details.
- Open the Web Browser.
- Display About information.
- Exit or close the activity, if implemented.

The selected menu item triggers the corresponding action.

### 2. Popup Menu

The Popup Menu provides a compact menu attached to a specific view, such as a button.

It can be used to:
- Open the Web Browser.
- Open Student Details.
- Access additional application actions.

The actual actions depend on the menu items implemented in the project.

### 3. In-App WebView

The `WebView` component displays web content within the application.

Features include:
- Loading a website.
- Navigating between web pages.
- Keeping browsing inside the app when supported by the configured `WebViewClient`.
- Using WebView settings to enable JavaScript if required by the website.
- Handling page-loading errors, if implemented.

### 4. Browser Navigation Controls

The WebView screen supports the following browser controls:

- **Back:** Navigate to the previous page in the WebView history.
- **Forward:** Navigate to the next page when available.
- **Reload:** Reload the current webpage.

These actions use the WebView's navigation history and loading methods.

### 5. Student Profile

The Student Details screen displays:

- **Name:** Spencer Aaron Fernandes
- **USN:** 25MCAR0123
- **Course:** MCA General
- **College:** Jain College, Bangalore
- **Address:** Goa

### 6. Activity Navigation

The application uses explicit Android `Intent` objects to navigate between activities.

This separates the dashboard, browser, and student profile into different screens.

---

## 🛠️ Technologies Used

- **Android Studio** — Development environment.
- **Java** — Application programming language.
- **XML** — User interface and menu layouts.
- **Android SDK** — Android application APIs.
- **Options Menu** — Toolbar menu navigation.
- **Popup Menu** — Contextual action menu.
- **WebView** — Embedded browser component.
- **WebViewClient** — Handles navigation and page-loading events.
- **WebSettings** — Configures WebView behaviour.
- **Intent** — Navigation between activities.
- **AndroidManifest.xml** — Activity declarations and permissions.

---

## 📂 Project Structure

The expected project structure is:

    MenusAndWebviews/
    ├── app/
    │   └── src/
    │       └── main/
    │           ├── AndroidManifest.xml
    │           │
    │           ├── java/
    │           │   └── com/example/menusandwebviews/
    │           │       ├── MainActivity.java
    │           │       ├── WebViewActivity.java
    │           │       └── StudentDetailsActivity.java
    │           │
    │           └── res/
    │               ├── layout/
    │               │   ├── activity_main.xml
    │               │   ├── activity_web_view.xml
    │               │   └── activity_student_details.xml
    │               │
    │               ├── menu/
    │               │   ├── options_menu.xml
    │               │   └── popup_menu.xml
    │               │
    │               └── values/
    │                   ├── colors.xml
    │                   ├── strings.xml
    │                   └── themes.xml
    │
    ├── screenshots/
    │   ├── output.png
    │   ├── testcase1.png
    │   ├── testcase2.png
    │   └── testcase3.png
    │
    ├── build.gradle
    └── README.md

*Note: The layout filenames and directory structure above are illustrative. Keep the actual filenames and Gradle file names used in your Android Studio project.*

---

## 🧩 Important Components

### MainActivity.java

The main activity initializes the dashboard and connects menu actions to their corresponding functionality.

Typical responsibilities include:
- Initializing the user interface.
- Inflating the Options Menu.
- Handling Options Menu selections.
- Displaying the Popup Menu.
- Launching other activities through `Intent`.

### WebViewActivity.java

The WebView activity initializes the browser and its navigation controls.

Important APIs include:

- `WebView`
- `WebViewClient`
- `WebSettings`
- `canGoBack()`
- `goBack()`
- `canGoForward()`
- `goForward()`
- `reload()`

These APIs allow the application to manage web navigation and browser history.

### StudentDetailsActivity.java

The Student Details activity displays the student's profile using XML layouts and Android views.

### AndroidManifest.xml

The manifest declares the application's activities and the Internet permission required for online browsing.

The following permission is typically required for loading websites:

    <uses-permission android:name="android.permission.INTERNET" />

Activities must also be declared in the manifest according to the application's configuration.

### Options Menu XML

The Options Menu XML defines the menu items displayed in the toolbar or action bar.

### Popup Menu XML

The Popup Menu XML defines the secondary actions shown when the popup menu is opened.

---

## 🧪 Test Cases

### Test Case 1: Menu Navigation

**Objective:** Verify that the menu opens the correct screen.

**Steps:**
1. Launch the application.
2. Open the Options Menu.
3. Select the Student Details option.
4. Observe the displayed screen.

**Expected Result:** The Student Details activity opens and displays the student's information.

**Status:** Update after testing.

**Screenshot:** <img width="746" height="1600" alt="WhatsApp Image 2026-10-09 at 9 55 13 PM" src="https://github.com/user-attachments/assets/5d3a9788-8a82-42c0-bc8a-f15915a5ecf9" />


### Test Case 2: WebView Browsing

**Objective:** Verify that web content loads inside the application.

**Steps:**
1. Launch the application.
2. Open the Web Browser.
3. Wait for the selected website to load.
4. Navigate to another page or link.
5. Test Back, Forward, and Reload.

**Expected Result:** The webpage displays inside the WebView, and the navigation controls work according to the available browsing history.

**Status:** Update after testing.

**Screenshot:** <img width="746" height="1600" alt="WhatsApp Image 2026-10-09 at 9 55 14 PM" src="https://github.com/user-attachments/assets/0d6d2729-d431-45bc-b7d8-1ecd9855a4e2" />


### Test Case 3: Student Profile

**Objective:** Verify that the Student Details screen displays the correct information.

**Steps:**
1. Launch the application.
2. Open the Options Menu or Popup Menu.
3. Select Student Details.
4. Verify the displayed information.

**Expected Result:** The screen displays the correct name, USN, course, college, and address.

**Status:** Update after testing.

**Screenshot:** <img width="746" height="1600" alt="WhatsApp Image 2026-10-09 at 9 55 14 PM (1)" src="https://github.com/user-attachments/assets/59dfbc6e-3a45-416b-823b-181c0a2fad2d" />


### Test Case 4: WebView Back Navigation

**Objective:** Verify that the device Back button handles browser history correctly.

**Steps:**
1. Open the WebView.
2. Load a website.
3. Navigate to another webpage.
4. Press the device Back button.

**Expected Result:** If the WebView has a previous page, it navigates back. Otherwise, the activity follows the application's normal Back behaviour.

**Screenshot:** <img width="746" height="1600" alt="WhatsApp Image 2026-10-09 at 9 55 14 PM (2)" src="https://github.com/user-attachments/assets/d1d6c11c-7b32-48a7-b6ae-3ac96509e989" />


---

## 🚀 How to Run the Project

1. Clone or download the repository from GitHub.
2. Open Android Studio.
3. Select **Open** or **Open an Existing Project**.
4. Choose the project directory.
5. Wait for Gradle synchronization to finish.
6. Select an Android emulator or connect a physical Android device.
7. Click **Run** to launch the application.
8. Test the Options Menu, Popup Menu, WebView navigation, and Student Details screen.

**Note:** Internet connectivity is required to load online websites.

---

## 📸 Screenshots

Store screenshots of your actual application output in the `screenshots/` directory.

Suggested screenshots:

- `output.png` — Main dashboard.
- `testcase1.png` — Options Menu or Student Details navigation.
- `testcase2.png` — WebView displaying a webpage and navigation controls.
- `testcase3.png` — Student Details screen.

Add screenshots only after capturing them from your running application.

---

## 📤 GitHub Submission Commands

Create an empty GitHub repository named `Experiment-8-Android-Menus-WebView`. Then open the terminal in the project root and run the following commands.

    git init
    git add .
    git commit -m "Complete Experiment 8: Menus and WebView - Spencer Aaron Fernandes (25MCAR0123)"
    git branch -M main
    git remote add origin https://github.com/YOUR_USERNAME/Experiment-8-Android-Menus-WebView.git
    git push -u origin main

Replace `YOUR_USERNAME` with your GitHub username.

If the `origin` remote already exists, update it instead of adding it again:

    git remote set-url origin https://github.com/YOUR_USERNAME/Experiment-8-Android-Menus-WebView.git

Then upload the changes:

    git add .
    git commit -m "Update Experiment 8 README"
    git push

---

## 📚 Concepts Learned

Through this experiment, the following Android development concepts are explored:

- Creating and handling Options Menus.
- Creating Popup Menus.
- Navigating between activities with Intents.
- Embedding a browser using WebView.
- Configuring WebView behaviour.
- Managing browser history.
- Implementing Back, Forward, and Reload controls.
- Declaring activities and permissions in the Android manifest.
- Designing Android interfaces using XML.
- Organizing and submitting an Android Studio project through GitHub.

---

## ✅ Result

The experiment demonstrates the design of an Android application integrating menu-based navigation, student profile display, and an embedded WebView with browser navigation controls.

The implementation can be verified by running the application and testing each feature on an emulator or Android device.

---

## 📝 Conclusion

This experiment provides practical experience with Android Options Menus, Popup Menus, activity navigation, and WebView integration. It demonstrates how menu actions can connect different screens and how a WebView can provide in-app browsing with history controls.

These concepts form a foundation for building Android applications with structured navigation and embedded web content.

---

## 👨‍💻 Author

**Spencer Aaron Fernandes**  
**USN:** 25MCAR0123  
**Course:** MCA General  
**Experiment:** 8
