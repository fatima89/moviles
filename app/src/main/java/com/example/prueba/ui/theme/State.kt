package com.example.prueba.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource

@Composable
fun TapCounter(){
    //var counter =remember{
    var counter by remember {
        mutableIntStateOf(0)
    }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text=counter.toString(),
            fontSize=30.sp
        )
        Button(onClick = {
            //counter=counter +1
            counter++
        }){
            Icon(
                imageVector = Icons.Default.Build,
                contentDescription = null,
                modifier = Modifier
                    .size(16.dp)
            )
            //Image(imageVector= painterResource(id = R.drawable.ic))
            Spacer(
                modifier=Modifier.size(16.dp)
            )

            Text(text = "Tap Me!")
        }
        Button(onClick = {
            counter = 0
        }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier
                    .size(16.dp)
            )
            Spacer(
                modifier = Modifier
                    .size(16.dp)
            )
            Text(text = "Reset!")
        }

    }
}

@Preview(showBackground=true)
@Composable
fun TapPreview(){
    TapCounter()
}