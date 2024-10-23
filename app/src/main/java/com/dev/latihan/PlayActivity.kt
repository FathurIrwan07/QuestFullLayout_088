package com.dev.latihan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun PlayActivity (modifier: Modifier = Modifier) {
    Column (modifier = modifier.fillMaxSize()){
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Kepada Yth : ")
        Text(text = "Jodi : ")

        MainSection(judulParem = "Nama", isiParem = "Fathur")
        MainSection(judulParem = "Kelas", isiParem = "B")
        MainSection(judulParem = "NIM", isiParem = "20220140088")
        MainSection(judulParem = "Keterangan", isiParem = "Sukses selalu")



    }
}

@Composable
fun SectionHeader() {
    Box(modifier = Modifier.fillMaxWidth().background(color = Color.DarkGray)) {
        Row {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(painter = painterResource(id = R.drawable.umyy), contentDescription = null, Modifier.size(100.dp)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = " ",
                    Modifier.padding(end = 13.dp),
                    tint = Color.Red,

                )
            }

            Column (Modifier.padding(15.dp)) {
                Text(text = "Teknologi Informasi",
                    color = Color.White
                    )

                Spacer(Modifier.padding(3.dp))

                Text(text = "Universitas Gamping Mengidul",
                    color = Color.White
                    )

            }

        }

    }

}

@Composable
fun MainSection(judulParem:String, isiParem:String) {
    Column (horizontalAlignment = Alignment.Start) {


        //Spacer(modifier = Modifier.padding(10.dp).fillMaxWidth().padding(1.dp))

        Row (modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = judulParem, modifier = Modifier.weight(0.8f))
            Text(text = ":")
            Text(text = isiParem, modifier = Modifier.weight(2f))



        }

    }
}