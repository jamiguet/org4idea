package tk.skuro.idea.orgmode.highlight;

import java.awt.Font;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;

/**
 * @author Carlo Sciolla
 * @since 0.1
 */
public interface OrgHighlighterColors {
    public static final TextAttributesKey COMMENTS_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "ORG.COMMENT", new TextAttributes(null, null, null, null, Font.ITALIC)
    );

    public static final TextAttributesKey OUTLINE_ATTR_KEY = TextAttributesKey.createTextAttributesKey(
            "OUTLINE.COMMENT", new TextAttributes(null, null, null, null, Font.BOLD)
    );
}
