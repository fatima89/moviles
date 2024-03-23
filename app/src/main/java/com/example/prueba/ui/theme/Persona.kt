package com.example.prueba.ui.theme


import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba.ui.theme.Person

@Composable
fun ListPerson(){
   //super.onCreate(savedInstanceState)
    var name by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("")
    }
    var persons by remember {
        mutableStateOf(listOf<Person>())
    }

    val context= LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()) {
        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            TextField(
                //value = "",
                value =name,
                placeholder = {Text("Enter name")},
                onValueChange = {text->
                    name=text
                })
        }
        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            TextField(
                //value = "",
                value =age,
                placeholder = {Text("Enter age")},
                onValueChange = {text->
                    age=text
                })
            }

        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Button(modifier =Modifier.padding(end = 16.dp),
                onClick = { /*TODO*/
                    if(name.isNotBlank() && age.isNotBlank()){
                        val newPerson = Person(name, age.toInt())
                        persons=persons+newPerson
                    }else{
                        Toast.
                        makeText(
                            context,"Enter a valid name",
                            Toast.LENGTH_SHORT)
                            .show()
                    }
                    name=""
                    age=""
                })
            {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Icono de agregar",
                    modifier = Modifier
                        .size(16.dp)
                )
                Text(text = "Add Person")
            }
        }

        Spacer(
            modifier = Modifier.weight(1f)
            //   .size(16.dp)
        )
        LazyColumn {
            items(persons){ person ->
                Text(
                    text="Name: ${person.name}, Age: ${person.age}",
                    modifier=Modifier.padding(16.dp)
                )
                Divider()

            }
        }
    }
}

@Preview(showBackground=true)
@Composable
fun PersonPreview(){
    ListPerson()
}