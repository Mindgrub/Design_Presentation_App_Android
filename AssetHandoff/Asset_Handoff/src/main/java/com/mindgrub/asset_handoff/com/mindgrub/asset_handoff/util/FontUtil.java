package com.mindgrub.asset_handoff.com.mindgrub.asset_handoff.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by charlesberlin on 3/9/14.
 */
public class FontUtil
{
    public static Typeface getCafetaTypeFace(Context ctx)
    {
        return Typeface.createFromAsset(ctx.getAssets(), "fonts/CAFETA_.TTF");
    }

    public static Typeface getHelveticaLTProBoldTypeFace(Context ctx)
    {
        return Typeface.createFromAsset(ctx.getAssets(), "fonts/HelveticaNeueLTPro-Bd_3.otf");
    }

    public static Typeface getEnigmaTypeFace(Context ctx)
    {
        return Typeface.createFromAsset(ctx.getAssets(), "fonts/Enigma_.TTF");
    }
}
