package com.github.kuckjwi0928.airplugin.services

import com.intellij.openapi.project.Project
import com.github.kuckjwi0928.airplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
