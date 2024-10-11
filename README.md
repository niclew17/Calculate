## Contributing to the Command Line Calculator Project

Welcome, students! This tutorial will guide you through the process of contributing to our open-source command line calculator project.

### Project Overview

Our calculator (https://github.com/niclew17/Calculate) has basic arithmetic operations, but there's a bug that needs fixing, and we want to expand its capabilities by adding a power function[1].

### Step 1: Fork and Clone the Repository

1. Go to https://github.com/niclew17/Calculate
2. Click the "Fork" button in the top-right corner to create a copy in your account.
3. Clone your forked repository to your local machine:

```bash
git clone https://github.com/your-username/Calculate.git
cd Calculate
```

### Step 2: Create a New Branch

Create a new branch for your changes:

```bash
git checkout -b fix-bug-and-add-power
```

### Step 3: Identify and Fix the Bug

1. Open the `Calculate` file in your text editor.
2. Run the calculator and test all functions to identify the bug.
3. Once you've found the bug, implement a fix.

### Step 4: Add Power Functionality

1. Implement a new function to calculate x raised to the power of y.
2. Update the main calculator logic to include this new operation.

### Step 5: Test Your Changes

Run the calculator script and thoroughly test both your bug fix and the new power function to ensure they work correctly.

### Step 6: Commit Your Changes

Stage and commit your changes:

```bash
git add Calculate
git commit -m "Fix bug and add power functionality"
```

### Step 7: Push Your Changes

Push your changes to your forked repository:

```bash
git push origin fix-bug-and-add-power
```

### Step 8: Create a Pull Request

1. Go to your forked repository on GitHub.
2. Click "Pull requests" and then "New pull request".
3. Ensure the base repository is the original project and the head repository is your fork.
4. Click "Create pull request".
5. Add a title and description explaining your changes.
6. Submit the pull request.

### Best Practices

- Write clear, concise commit messages.
- Follow the existing code style and conventions.
- Test your changes thoroughly before submitting.
- Be responsive to feedback and be prepared to make additional changes if requested.

### Conclusion

By following these steps, you'll contribute to an open-source project by fixing a bug and adding new functionality. This process is typical for many open-source contributions. Remember, the goal is to learn and improve your skills through practical experience.

Happy coding, and thank you for your contribution!

Citations:
[1] https://github.com/niclew17/Calculate