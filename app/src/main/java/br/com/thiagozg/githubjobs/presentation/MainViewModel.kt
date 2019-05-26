package br.com.thiagozg.githubjobs.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.thiagozg.githubjobs.data.GitHubRepository
import br.com.thiagozg.githubjobs.domain.InputQueryDTO
import br.com.thiagozg.githubjobs.domain.JobsVO
import kotlinx.coroutines.SupervisorJob

/*
 * Created by Thiago Zagui Giacomini on 24/05/2019.
 * See thiagozg on GitHub: https://github.com/thiagozg
 */
class MainViewModel : ViewModel() {

    val jobsData = MutableLiveData<JobsVO>()

    private val viewModelJob = SupervisorJob()

    fun fetchJobs(inputQueryDTO: InputQueryDTO) {
        repository.fetchJobs(inputQueryDTO, jobsData, viewModelJob)
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    companion object {
        private lateinit var repository: GitHubRepository

        fun providesViewModel(application: Application) {
            repository = GitHubRepository(application)
        }
    }

}