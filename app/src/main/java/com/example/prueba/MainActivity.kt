package com.example.prueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prueba.ui.theme.PruebaTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
Box(modifier=Modifier.size(400.dp)){
    Text(
        text = "Text 1!",
        color = Color.Black,
        fontSize = 40.sp,
        modifier = Modifier
            .align(Alignment.TopEnd)
        )
    Text(
        text = "Text 2!",
        color = Color.Black,
        fontSize = 40.sp,
        modifier = Modifier
            .align(Alignment.CenterStart)
        )
}


   /* Column(
    modifier=Modifier.background(Color.Magenta)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally)
    {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Text(
            text = "Text 1!",
            color = Color.Black,
            fontSize = 40.sp,

            )
        Text(
            text = "Text 2!",
            color = Color.Black,
            fontSize = 40.sp,

            )
    }
    Text(
        text = "HI $name!",
        color = Color.Black,
        fontSize = 40.sp,
        //modifier =Modifier
        //  .background(Color.Magenta)
        //.padding(16.dp)
        //.background(Color.LightGray)

    )
    Text(
        text = "Some other!",
        color = Color.Black,
        fontSize = 40.sp,

        )
}*/

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PruebaTheme {
        Greeting("Fatima")
    }
}