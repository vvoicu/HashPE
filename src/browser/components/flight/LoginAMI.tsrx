<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>LoginAMI</className>
    <objects>
        <object type="EditField" technology="Web">
            <name>userName</name>
            <codeName>UserNameEditField</codeName>
            <identification>
                <properties>
                    <property name="Type" type="string" isRegExp="false">text</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Name" type="string" isRegExp="false">userName</property>
                </properties>
            </identification>
        </object>
        <object type="EditField" technology="Web">
            <name>password</name>
            <codeName>PasswordEditField</codeName>
            <identification>
                <properties>
                    <property name="Type" type="string" isRegExp="false">password</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Name" type="string" isRegExp="false">password</property>
                </properties>
            </identification>
        </object>
        <object type="Image" technology="Web">
            <name>Sign-In</name>
            <codeName>SignInImage</codeName>
            <identification>
                <properties>
                    <property name="Alt" type="string" isRegExp="false">Sign-In</property>
                    <property name="Type" type="enum" isRegExp="false">Button</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
