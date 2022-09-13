package pe.edu.ulima.itlab.memoriagame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.ulima.itlab.memoriagame.ui.theme.MemoriaGameTheme

class BoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Texto()
        }
    }
}

@Composable
fun Texto() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Why hello extranger",
        modifier = Modifier.weight(1f))
        Text(text = "I'm a column",
        modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier.fillMaxWidth()
                .weight(3f)
        ) {
            Button(onClick = { /*TODO*/},
                modifier = Modifier.fillMaxWidth(0.5f)) {
                Text(text = "Boton 1")
            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "Boton 2")
            }
        }

    }
}
@Composable
@Preview
fun showTexto() {
    MemoriaGameTheme {
        Texto()
    }
}