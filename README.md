Here's a step-by-step tutorial to help students contribute to an open source project on GitHub:

## How to Make Your First Open Source Contribution on GitHub

### Setting Up

1. Create a GitHub account if you don't already have one.

2. Install Git on your local machine.

3. Configure Git with your name and email:

```bash
git config --global user.name "Your Name"
git config --global user.email "youremail@example.com"
```

### Finding a Project

1. Explore GitHub to find a project that interests you. Some good places to start:
   - GitHub Explore
   - First Timers Only
   - Up For Grabs

2. Look for projects with labels like "good first issue" or "beginner-friendly"[2].

### Forking and Cloning

1. On the project's GitHub page, click the "Fork" button in the top-right corner. This creates a copy of the repository in your account[4].

2. Clone your forked repository to your local machine:

```bash
git clone https://github.com/your-username/repository-name.git
```

3. Navigate to the project directory:

```bash
cd repository-name
```

### Creating a Branch

1. Create a new branch for your changes:

```bash
git checkout -b your-branch-name
```

Name your branch something descriptive, like "fix-typo-in-readme"[4].

### Making Changes

1. Open the project in your preferred text editor or IDE.

2. Make the changes you want to contribute. Start small - fixing a typo or updating documentation is a great first contribution[2].

### Committing Changes

1. Stage your changes:

```bash
git add .
```

2. Commit your changes with a descriptive message:

```bash
git commit -m "Brief description of your changes"
```

### Pushing Changes

1. Push your changes to your forked repository:

```bash
git push origin your-branch-name
```

### Creating a Pull Request

1. Go to your forked repository on GitHub.

2. Click on "Pull requests" and then "New pull request".

3. Ensure the base repository is the original project and the head repository is your fork.

4. Click "Create pull request".

5. Add a title and description for your pull request, explaining your changes[6].

6. Click "Create pull request" again to submit.

### Following Up

1. The project maintainers may ask for changes. If so, make the changes locally, commit, and push them to your fork. The pull request will update automatically.

2. Be patient and respectful. Maintainers are often volunteers and may take time to review your contribution[5].

3. If your pull request is accepted, congratulations! You've made your first open source contribution.

### Best Practices

- Always read the project's CONTRIBUTING.md file (if available) for specific guidelines[5].
- Be polite and respectful in all interactions.
- Start small. It's better to make several small contributions than one large one[2].
- Don't be discouraged if your first pull request isn't accepted. It's all part of the learning process.

Remember, every expert was once a beginner. With patience and persistence, you'll become a valuable contributor to the open source community. Happy coding!

Citations:
[1] https://github.com/firstcontributions/first-contributions/actions
[2] https://daily.dev/blog/how-to-contribute-to-open-source-github-repositories
[3] https://docs.github.com/en/get-started/exploring-projects-on-github/finding-ways-to-contribute-to-open-source-on-github
[4] https://www.dataschool.io/how-to-contribute-on-github/
[5] https://opensource.guide/how-to-contribute/
[6] https://www.freecodecamp.org/news/git-and-github-workflow-for-open-source/
[7] https://docs.github.com/en/get-started/exploring-projects-on-github/contributing-to-a-project
[8] https://github.com/freeCodeCamp/how-to-contribute-to-open-source