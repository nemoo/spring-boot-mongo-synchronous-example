package project

import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class TestData(private val projectRepository: ProjectRepository) : ApplicationListener<ContextRefreshedEvent> {
	override fun onApplicationEvent(p0: ContextRefreshedEvent) {
		println("Creating test data...")
		projectRepository.save(Project(name = "alpha"))
		projectRepository.save(Project(name = "beta"))
		projectRepository.save(Project(name = "alpha"))
		println("Querying test data...")
		projectRepository.findAll().forEach { println(it) }
		println("Initialization phase finished")
	}
}