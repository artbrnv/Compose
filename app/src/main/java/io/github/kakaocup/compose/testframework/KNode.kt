package io.github.kakaocup.compose.testframework

import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.fragment.app.FragmentActivity

open class KNode<ACTIVITY: FragmentActivity> : KDSLView<KNode<ACTIVITY>>, NodeAssertions {
    override val nodeInteraction: SemanticsNodeInteraction

    constructor(composeScreen: ComposeScreen<*, ACTIVITY>, function: ViewBuilder.() -> Unit)  {
        nodeInteraction = ViewBuilder(composeScreen.composeTestRule).apply(function).nodeInteraction
    }
}