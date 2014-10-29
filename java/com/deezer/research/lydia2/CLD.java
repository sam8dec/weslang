package com.deezer.research.lydia2;

import com.deezer.research.cld2.Cld2;
import com.deezer.research.cld2.Result;

public class CLD {
    public static String detectLanguage(String text) {
        Result result = Cld2.detect(text);
        if (result.code.equals("")) {
            return "unk";
        }
        String code = result.code;
        double confidence = result.confidence;
        if (code.equals("zh")) {
            code = "zh-cn";
        } else if (code.equals("zh-Hant")) {
            code = "zh-tw";
        } else if (code.equals("iw")) {
            code = "he";
        } else if (code.equals("un")) {
            code = "unk";
        }
        return code;
    }
}
