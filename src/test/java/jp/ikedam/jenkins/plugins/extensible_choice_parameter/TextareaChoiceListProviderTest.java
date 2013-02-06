/*
 * The MIT License
 * 
 * Copyright (c) 2012-2013 IKEDA Yasuyuki
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jp.ikedam.jenkins.plugins.extensible_choice_parameter;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests for TextareaChoiceListProvider, not corresponding to Jenkins.
 */
public class TextareaChoiceListProviderTest extends TestCase
{
    public void testTextareaChoiceListProvider_choiceListText()
    {
        // complete tests are done in TextareaStringListUtilityTest.
        String choiceListText = "a\nb\nc\n";
        TextareaChoiceListProvider target = new TextareaChoiceListProvider(choiceListText, null);
        assertEquals(
                "Basic test of choiceListText in TextareaChoiceListProvider()",
                Arrays.asList("a", "b", "c"),
                target.getChoiceList()
        );
    }
}
