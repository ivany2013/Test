package service.demo;

import org.apache.thrift.TException;
import service.demo.Hello.Iface;

public class HelloServiceImpl implements Iface {

    public String helloString(String para) throws TException {
        return "result:" + para;
    }
}
