package br.com.thiagozg.githubjobs.jobsresults.di

import br.com.thiagozg.githubjobs.jobsresults.MainViewModel
import br.com.thiagozg.githubjobs.jobsresults.adapter.JobsResultAdapter
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/*
 * Created by Thiago Zagui Giacomini on 22/07/2019.
 * See thiagozg on GitHub: https://github.com/thiagozg
 */
val mainModule = module {
    viewModel { MainViewModel(get()) }
    factory { JobsResultAdapter() }
}