package org.d3if3169.doghotel.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults.cardColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.d3if3169.doghotel.R
import org.d3if3169.doghotel.navigation.Screen
import org.d3if3169.doghotel.ui.component.SmallText
import org.d3if3169.doghotel.ui.theme.DarkBlueDefault
import org.d3if3169.doghotel.ui.theme.Poppins

@Composable
fun MainScreen(navHostController: NavHostController) {
    ScaffoldComponent(
        isMain = true, navHostController = navHostController,
        title = "Dog Hotel"
    ) {
        ScreenContent(modifier = it, navHostController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ScreenContent(modifier: Modifier = Modifier, navHostController: NavHostController) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.size(211.dp, 257.dp),
            alignment = Alignment.Center,
            painter = painterResource(id = R.drawable.dog_1),
            contentDescription = stringResource(
                R.string.gambar_anjing_home
            )
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OutlinedCard(
                onClick = { navHostController.navigate(Screen.Rules.route) },
                colors = cardColors(
                    containerColor = Color.Transparent,
                    contentColor = DarkBlueDefault
                ),
                border = BorderStroke(1.dp, DarkBlueDefault)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Image(
                        modifier = Modifier.size(136.dp, 117.dp),
                        painter = painterResource(id = R.drawable.dog_rules),
                        contentDescription = stringResource(
                            R.string.peraturan_anjing_home
                        )
                    )
                    SmallText(
                        text = stringResource(id = R.string.peraturan_anjing_home),
                        textAlign = TextAlign.Center,
                        color = DarkBlueDefault
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedCard(
                onClick = { navHostController.navigate(Screen.Notes.route) },
                colors = cardColors(
                    containerColor = Color.Transparent,
                    contentColor = DarkBlueDefault
                ),
                border = BorderStroke(1.dp, DarkBlueDefault)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Image(
                        modifier = Modifier.size(136.dp, 117.dp),
                        painter = painterResource(id = R.drawable.notes),
                        contentDescription = stringResource(
                            R.string.catatan_anjing_home
                        )
                    )
                    SmallText(
                        text = stringResource(id = R.string.catatan_anjing_home),
                        textAlign = TextAlign.Center,
                        color = DarkBlueDefault
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            shape = RoundedCornerShape(20.dp),
            onClick = { navHostController.navigate(Screen.Form.route) },
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = DarkBlueDefault,
                contentColor = Color.White
            ),
            contentPadding = PaddingValues(horizontal = 62.dp, vertical = 16.dp),
            border = BorderStroke(1.dp, DarkBlueDefault)
        ) {
            Text(
                text = stringResource(R.string.pesan_button),
                fontSize = 16.sp,
                fontFamily = Poppins
            )
        }
    }
}


@Preview
@Composable
private fun Prev() {
    MainScreen(navHostController = rememberNavController())
}