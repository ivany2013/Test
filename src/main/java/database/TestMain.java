package database;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestMain {

    public static void batchprintPDF(){
        for (int i = 0; i < 100000000 ; i++) {
            if (i==5000){
                try {
                    Thread.currentThread().interrupt();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        poolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    TestMain.batchprintPDF();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println();
        poolExecutor.shutdown();
        /*final String URL = "jdbc:mysql://192.168.11.168:3306/intellif_base?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        final String USER = "root";
        final String PASS_WORD = "introcks1234";
        String sql = "INSERT INTO t_violation_record_ticket (record_id,ticket_json,ticket_tcode,created,updated) VALUES (566,'{\"tCode\":\"10044\",\"agency\":\"福建交警总队漳州高速公路支队二大队\",\"illegalBehavior\":\"依法应当登记方可上道路行驶的非机动车，非经登记上道路行驶\",\"created\":\"2018年08月21日\",\"rules\":[\"国家安全法；\",\"未成年人保护法；\",\"婚姻保护法\"],\"idNumber\":\"3505050505050502\",\"plateNumber\":\"粤B:9594\",\"illegalAddr\":\"违法地点\",\"limitTime\":\"15日内\",\"personName\":\"迭代的\",\"punishment\":\"罚款5120元\",\"illegalBehavior2\":\"\",\"contactAddr\":\"啊啊啊\",\"illegalBehavior1\":\"\",\"policeName\":\"hkb\",\"illegalCode\":\"2003\",\"contactPhone\":\"18650346004\",\"illegalDate\":\"2018年08月15日 08:55:00\",\"executiveAgency\":\"福建交警总队漳州高速公路支队二大队\",\"vehicleType\":\"非机动车\"}',\"10044\"\t,\"2018-08-21 14:14:13\",\t\"2018-08-21 14:14:13\")";
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS_WORD);
            statement = connection.createStatement();
            for (int i = 0; i < 5000; i++) {
                statement.execute(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}
