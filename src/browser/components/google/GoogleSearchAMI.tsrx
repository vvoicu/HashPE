<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>GoogleSearchAMI</className>
    <objects>
        <object type="Page" technology="Web">
            <name>Google</name>
            <codeName>GooglePage</codeName>
            <identification/>
            <children>
                <object type="EditField" technology="Web">
                    <name>Search</name>
                    <codeName>SearchEditField</codeName>
                    <identification>
                        <properties>
                            <property name="Type" type="string" isRegExp="false">text</property>
                            <property name="TagName" type="string" isRegExp="false">INPUT</property>
                            <property name="Name" type="string" isRegExp="false">q</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
