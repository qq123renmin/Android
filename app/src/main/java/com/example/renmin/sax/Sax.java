package com.example.renmin.sax;

import android.util.Log;

import com.example.renmin.bean.TodayWeather;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by renmin on 2015/3/24.
 */
public class Sax extends DefaultHandler {

        private int count = 0;

        //    当解析到文档开始时的回调方法
        @Override
        public void startDocument() throws SAXException{
            super.startDocument();
        }

        //    当解析到xml的标签时的回调方法
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            Log.i("yao", qName);
            if (qName.equals("forecast_conditions")) {
                count++;
            }
            Log.i("yao", "" + count);
            if (count == 2) {
                if (qName.equals("low")) {
                    TodayWeather.setLow(attributes.getValue("data"));
                }
                if (qName.equals("high")) {
                    TodayWeather.setHigh(attributes.getValue("data"));
                }
            }
            super.startElement(uri, localName, qName, attributes);
        }

        //    当解析到xml的文本内容时的回调方法
        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
        }

        //    当解析到标签的结束时的回调方法
        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException{
            super.endElement(uri, localName, qName);
        }

        public void endDocument() throws SAXException {
             super.endDocument();
         }


}
