package com.github.simonberens.snippets.services

import com.intellij.openapi.project.Project
import com.github.simonberens.snippets.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
