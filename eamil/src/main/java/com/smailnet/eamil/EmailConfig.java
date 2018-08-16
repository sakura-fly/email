/*
 * Copyright 2018 Lake Zhang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.smailnet.eamil;

/**
 * Email for Android是基于JavaMail封装的电子邮件库，简化在Android客户端中编写
 * 发送电子邮件的的代码。把它集成到你的Android项目中，只需简单配置邮件服务器，即
 * 可使用，所见即所得哦！
 *
 * @author 张观湖
 * @author E-mail: zguanhu@foxmail.com
 * @version 1.0
 */
public class EmailConfig {

    private int smtpPort;
    private int popPort;
    private String smtpHost;
    private String popHost;
    private String account;
    private String password;

    public EmailConfig setSmtpHost(String smtpHost){
        this.smtpHost = smtpHost;
        return this;
    }

    public EmailConfig setPopHost(String popHost){
        this.popHost = popHost;
        return this;
    }

    public EmailConfig setSmtpPort(int smtpPort){
       this.smtpPort = smtpPort;
       return this;
    }

    public EmailConfig setPopPort(int popPort){
        this.popPort = popPort;
        return this;
    }

    public EmailConfig setAccount(String account){
        this.account = account;
        return this;
    }

    public EmailConfig setPassword(String password){
        this.password = password;
        return this;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public String getPopHost() {
        return popHost;
    }

    public int getPopPort() {
        return popPort;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}
