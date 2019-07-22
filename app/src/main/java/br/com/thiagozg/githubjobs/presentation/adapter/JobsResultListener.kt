package br.com.thiagozg.githubjobs.presentation.adapter

import br.com.thiagozg.githubjobs.data.model.JobDTO

/*
 * Created by Thiago Zagui Giacomini on 22/07/2019.
 * See thiagozg on GitHub: https://github.com/thiagozg
 */
interface JobsResultListener {

    fun onClick(jobDTO: JobDTO)

}