package com.example.inzure

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.inzure.ui.theme.AppTheme
import androidx.activity.SystemBarStyle
import androidx.compose.ui.graphics.Color
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurar la extensión de pantalla y ajustar el color de los íconos del sistema
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(scrim = 0, darkScrim = 0), // Íconos oscuros en barra de estado
            navigationBarStyle = SystemBarStyle.light(scrim = 0, darkScrim = 0) // Íconos oscuros en barra de navegación
        )

        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White // Fondo blanco en toda la pantalla
                ) {
                    MainScreen(
                        onNavigateToLogin = {
                            val intent = Intent(this@MainActivity, LoginScreen::class.java)
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

