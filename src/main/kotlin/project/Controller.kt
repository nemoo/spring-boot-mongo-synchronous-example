package project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller (private val projectRepository: ProjectRepository){

	@GetMapping("/projects")
	fun projects() = projectRepository.findAll()

	@GetMapping("/projects/name/{name}")
	fun projectsByName(@PathVariable name: String) = projectRepository.findByName(name)

	@GetMapping("/projects/{id}")
	fun project(@PathVariable id: String) = projectRepository.findById(id)

	@GetMapping("/test")
	fun test() = Project("asfasd", "Alpha")
}
