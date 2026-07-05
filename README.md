# Mobile Automation Sandbox

A Java-based mobile automation testing sandbox built with **Appium**, **JUnit 5**, **Maven**, and the **Android Emulator**.

This project serves as a playground for learning and practicing mobile automation concepts including:

- Appium
- Android Emulator
- Appium Inspector
- Native Android application testing
- Mobile automation framework design

---

## Tech Stack

- Java 17
- Maven
- JUnit 5
- Appium 3
- Appium Java Client
- UiAutomator2 Driver
- Android Studio
- Android SDK
- Android Emulator
- Appium Inspector

---

# Prerequisites

Install the following software before running the project:

- Java JDK 17+
- Android Studio
- Android SDK
- Appium
- Appium Inspector

---

# Environment Variables

Configure the following environment variables.

| Variable | Example |
|----------|---------|
| JAVA_HOME | `C:\Program Files\Java\jdk-17.0.18` |
| ANDROID_HOME | `C:\Users\<username>\AppData\Local\Android\Sdk` |
| ANDROID_SDK_ROOT | `C:\Users\<username>\AppData\Local\Android\Sdk` |

After updating environment variables, restart your terminal (or reboot Windows if necessary).

---

# Appium Setup

Install the Android automation driver:

```bash
appium driver install uiautomator2
```

Verify the installation:

```bash
appium driver list --installed
```

Expected output:

```
uiautomator2
```

---

# Android Emulator

Create an Android Virtual Device (AVD) using Android Studio.

Start the emulator before running tests.

Verify the emulator is connected:

```bash
adb devices
```

Expected output:

```
List of devices attached

emulator-5554    device
```

---

# Starting Appium

Start the Appium server:

```bash
appium
```

By default Appium listens on:

```
http://127.0.0.1:4723
```

---

# Appium Inspector

Launch Appium Inspector using the following capabilities:

```json
{
  "platformName": "Android",
  "appium:automationName": "UiAutomator2",
  "appium:deviceName": "emulator-5554"
}
```

---

# Running Tests

Execute the complete test suite:

```bash
mvn test
```

or

```bash
mvn clean test
```

---

# Project Structure

```
src
 ├── main
 └── test
      ├── BaseTest.java
      ├── HomeScreenTest.java
      └── ...
```

---

# Current Progress

✅ Local Android Emulator configured

✅ Appium Server configured

✅ Appium Inspector connected

✅ UiAutomator2 Driver installed

✅ Initial Appium session established

✅ Sample mobile automation tests executing successfully

---

# Future Enhancements

- Page Object Model (POM)
- Android gesture automation
- Swipe and scroll utilities
- Mobile waits and synchronization
- Screenshot utilities
- Reporting with Allure
- Parallel execution
- BrowserStack integration
- iOS support
- CI/CD integration with GitHub Actions

---

# Author

**Chukwuma Anyadike**

SDET | Test Automation Engineer

- Java
- Playwright
- Selenium
- REST Assured
- Appium
- JUnit 5
- Maven
- GitHub Actions