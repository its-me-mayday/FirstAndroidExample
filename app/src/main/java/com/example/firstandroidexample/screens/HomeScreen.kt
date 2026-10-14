package com.example.firstandroidexample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstandroidexample.ui.theme.FirstandroidexampleTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() { // Parent. Gestisce lo stato attraverso la variabile counter e di conseguenza HomeScreen si può definire Stateful.
    var counter by remember { mutableIntStateOf(value = 0) }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Home") })
        }
    ){ innerPadding ->
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues = innerPadding)
                    .padding(horizontal = 16.dp)) {

                    Spacer(Modifier.height(16.dp))

                    CounterSection(counter, onIncrement = { counter += 1 })

                    Spacer(Modifier.height(24.dp))
                }
    }
}

// CounterSection è un Composable Stateless: riceve il valore counter e
// la callback come parametri, per cui diventa un componente facilmente
// testabile e riutilizzabile. (parametrizzati e riciclati)
@Composable
fun CounterSection(counter: Int, onIncrement: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hai premuto $counter volte",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(Modifier.height(12.dp))
            Button(
                onClick = onIncrement,
                shape = MaterialTheme.shapes.small
            ) {
                Text(text = "Incrementa")
            }
        }
    }
}

@Preview(showBackground = true, name ="Home Screen Preview")
@Composable
fun HomeScreenPreview() {
    FirstandroidexampleTheme {
        HomeScreen()
    }
}