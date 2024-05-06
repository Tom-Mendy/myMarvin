# MY_MARVIN

## Introduction
`MY_MARVIN` is a Jenkins-based project aimed at mastering the art of automating everyday developer tasks. Utilizing Jenkins, the most popular open-source automation platform, this project encompasses setting up a comprehensive CI/CD pipeline that enhances the efficiency and reliability of the development process.

## Project Overview
This project includes learning and implementing Jenkins to automate tasks that range from simple periodic cleanups to full-scale production deployments. By the end of this project, you will gain hands-on experience in configuring and managing a Jenkins instance using Configuration as Code (JCasC) and Job Domain Specific Language (Job DSL).

## Technical Requirements
- **Jenkins Version**: Use the current LTS version of Jenkins.
- **Plugins**: Only the required plugins listed below should be installed. Any use of unnecessary plugins will lead to evaluation failures.
  - cloudbees-folder
  - configuration-as-code
  - credentials
  - github
  - instance-identity
  - job-dsl
  - script-security
  - structs
  - role-strategy
  - ws-cleanup

## Configuration Details
### Configuration as Code (JCasC)
- Implement your Jenkins configurations using a single YAML file named `my_marvin.yml`.
- Ensure no hardcoded passwords; use environment variables instead.

### Job DSL
- Centralize all your DSL scripts into one `job_dsl.groovy` file located at the root of the repository.

### Users & Roles
- **Hugo**: Admin with full permissions specified by the environment variable `USER_CHOCOLATEEN_PASSWORD`.
- **Garance**: "Gorilla" role with extended permissions including job creation and cancellation.
- **Jeremy**: "Ape" role with basic job build and view permissions.
- **Nassim**: "Assist" role with view-only access to jobs.

### Job Configurations
- **Tools Folder**: Contains all tool-related jobs and configurations.
- **Clone-Repository Job**: Setup a job to clone a repository from a provided GIT URL.
- **SEED Job**: Generate jobs based on provided GitHub repository details.

### Automation Strategy
Set automated triggers for job executions or configure manual triggers as needed, ensuring a robust and responsive CI/CD pipeline.

## Usage Recommendations
- **Testing**: Rigorously test your configuration and DSL scripts to ensure flawless operation during evaluations.
- **Docker**: For ease of setup and testing, utilize Docker containers to run your Jenkins instance locally without the need for full installation.
- **Leverage Existing Projects**: Use other Epitech projects to test your SEED job functionality.

## Installation and Setup

Setup your `.env` file with necessary environment variables for user passwords and other configurations as per the project specifications.

To get started with this project, ensure you have Docker installed and run the following command:

```bash
docker compose up --build
```

## Contributing
Feel free to fork the project and submit pull requests with enhancements or fixes that could improve the automation capabilities of `MY_MARVIN`.

## Versioning
This project adheres to Semantic Versioning. For the versions available, see the tags on this repository.

## Authors
- **Tom Mendy** - *Initial work* - [MyGitHubProfile](https://github.com/Tom-Mendy/)

## Acknowledgments
- Thanks to Epitech for providing the framework and use cases for this educational project.
- Shoutout to all contributors and Jenkins community for their continuous support.

---

Good luck with your DevOps journey with `MY_MARVIN`!
```
