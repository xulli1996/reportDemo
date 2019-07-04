/**
 * 程序库：http://www.xdocin.com/XDocService.jar
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hg.xdoc.XDocService;

public class Main {
    public static void main(String[] args) {
        XDocService xdocService = new XDocService();
        List<String > listKey = new ArrayList<>();
        List<String > listValue = new ArrayList<>();
        Map<String, Object> param = new HashMap<>();
        for (Integer i = 1; i<7; i++) {
            listKey.add(i.toString());
            listValue.add("这是"+i);
        }
        for (Integer i = 0; i<6; i++) {
            param.put(listKey.get(i), listValue.get(i));
        }

        try {
            xdocService.run("C:\\Users\\li\\Desktop\\实验室项目\\developmen\\报告\\Hello.docx",
                    param,
                    new File("C:\\Users\\li\\Desktop\\实验室项目\\developmen\\报告\\XDocResult1.docx"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

