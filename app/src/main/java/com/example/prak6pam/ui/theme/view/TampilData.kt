package com.example.prak6pam

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak6pam.ui.theme.view.FormIsian
import com.example.prak6pam.ui.theme.view.TampilData

enum class Navigasi {
    FormulirSaya,
    Detail
}


            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackButtonClick = { cancelAndBackToFormulirSaya(navController) }
                )
            }
        }
    }
}

