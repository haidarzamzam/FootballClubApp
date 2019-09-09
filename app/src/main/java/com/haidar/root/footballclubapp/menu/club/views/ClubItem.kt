package com.haidar.root.footballclubapp.menu.club.views

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.haidar.root.footballclubapp.menu.detailclub.views.ClubDetailActivity
import org.jetbrains.anko.*

class ClubItem : AnkoComponent<ViewGroup> {

    companion object {
        const val logoId = 1
        const val nameId = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        linearLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)
            gravity = Gravity.CENTER_VERTICAL

            imageView {
                id = ClubDetailActivity.ClubDetailActivityUI.logoId
            }.lparams(dip(40), dip(40)) {
                rightMargin = dip(10)
            }

            textView {
                id = nameId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "Club FC"
                textSize = 16f // <- it is sp, no worries
                textColor = Color.BLACK
            }

        }
    }
}