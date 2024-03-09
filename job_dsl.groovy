// def folderName = "Tools"
folder('Tools') {
    description('Folder for miscellaneous tools.')
}

job("Tools/clone-repository") {
    description("Job to clone a repository")
    wrappers {
        preBuildCleanup { // Clean before build
           includePattern('**/target/**')
            deleteDirectories()
            cleanupParameter('CLEANUP')
        }
    }
    steps {
        shell('git clone ${GIT_REPOSITORY_URL}')
    }
    // configure { project ->
    //     project / 'triggers' / 'spec' / 'hudson.triggers.SCMTrigger' {
    //         spec('* * * * *')
    //     }
    // }
}

// job("Tools/SEED") {
//     description("Seed job to create other jobs")
//     parameters {
//         stringParam('GITHUB_NAME', '', 'GitHub repository owner/repo_name (e.g.: "EpitechIT31000/chocolatine")')
//         stringParam('DISPLAY_NAME', '', 'Display name for the job')
//     }
//     steps {
//         dsl {
//             external('job_dsl.groovy')
//         }
//     }
//     configure { project ->
//         project / 'triggers' / 'spec' / 'hudson.triggers.SCMTrigger' {
//             spec('')
//         }
//     }
// }
