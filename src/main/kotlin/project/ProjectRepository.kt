package project

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.MongoRepository


@Document(collection = "projects")
data class Project(@Id val id: String? = null, val name: String)

interface ProjectRepository: MongoRepository<Project,String>{

    fun findByName(name: String): List<Project>
}

