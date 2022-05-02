package com.example.layoutcomposeapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

fun Modifier.firstBaseLineToTop(firstBaseLineToTop: Dp) =
    this.then(
        layout { measurable, constraints ->
            val placeable = measurable.measure(constraints = constraints)

            //check the composable has first baseline
            check(placeable[FirstBaseline] != AlignmentLine.Unspecified)
            val firstBaseLine = placeable[FirstBaseline]

            //Height of the composable with padding -first baseline
            val placeableY = firstBaseLineToTop.roundToPx() - firstBaseLine
            val height = placeable.height + placeableY
            layout(placeable.width, height) {
                //Where the composable gets placed
                placeable.placeRelative(0, placeableY)
            }
        }
    )
