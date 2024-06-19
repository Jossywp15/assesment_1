package org.d3if3169.doghotel.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if3169.doghotel.R
import org.d3if3169.doghotel.ui.component.RegularText
import org.d3if3169.doghotel.ui.theme.DarkBlueDefault

@Composable
fun NotesScreen(navHostController: NavHostController) {
    ScaffoldComponent(
        navHostController = navHostController,
        title = stringResource(id = R.string.catatan_anjing_notes),
        fab = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = DarkBlueDefault,
                contentColor = Color.White
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = stringResource(R.string.ikon_tombol_aksi_mengambang)
                )
            }
        }
    ) {
        ScreenContent(modifier = it)
    }
}

@Composable
private fun ScreenContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(206.dp, 210.dp),
            painter = painterResource(id = R.drawable.empty_state_doghotel),
            contentDescription = stringResource(R.string.gambar_data_kosong)
        )
        RegularText(text = stringResource(R.string.notes_kosong_text))
    }
}

@Preview
@Composable
private fun Prev() {
    NotesScreen(navHostController = rememberNavController())
}