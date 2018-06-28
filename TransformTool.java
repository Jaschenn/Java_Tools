

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TransformTool {
    //将结果集转换为Json格式的字符串
    public  String resultSet2Json(ResultSet resultSet) throws Exception{
        // json数组
          JSONArray array= new JSONArray();

       /*
       * 获取列数
       * */

            ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
//            System.out.println("列数"+columnCount);
//            System.out.println(metaData.getColumnLabel(1));
//            System.out.println(metaData.getColumnLabel(2));

        // 遍历ResultSet中的每条数据
        while (resultSet.next()) {
            JSONObject jsonObj = new JSONObject();
            // 遍历每一列
            for (int i = 1; i <= columnCount; i++) {
                String columnName =metaData.getColumnLabel(i);
                String value = resultSet.getString(columnName);
                jsonObj.put(columnName, value);
            }
            array.add(jsonObj);
        }

        return array.toString();

    }
}
