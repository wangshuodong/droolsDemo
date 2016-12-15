package com.wangsd.testMian;

import com.wangsd.droolsDemo.Message;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by Administrator on 2016/12/15.
 */
public class MessageTest {
    public static final void main(String[] args) {
        try {
            // load up the knowledge base
            // 得到一个KieService
            KieServices ks = KieServices.Factory.get();
            // 工作kieService加载默认路径下的kmodule.xml 得到kContainer场所
            KieContainer kContainer = ks.getKieClasspathContainer();
            // kContainer得到一个会话
            KieSession kSession = kContainer.newKieSession("ksession-message");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);

            // 将事实数据传入kSession中
            kSession.insert(message);
            // 执行所有的规则
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
