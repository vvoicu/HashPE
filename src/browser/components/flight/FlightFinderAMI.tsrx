<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>FlightSearchAMI</className>
    <objects>
        <object type="RadioGroup" technology="Web">
            <name>oneway</name>
            <codeName>TripType</codeName>
            <identification>
                <properties>
                    <property name="Type" type="string" isRegExp="false">radio</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Name" type="string" isRegExp="false">tripType</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>passCount</name>
            <codeName>PassCountListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">passCount</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>fromPort</name>
            <codeName>FromPortListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">fromPort</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>fromMonth</name>
            <codeName>FromMonthListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">fromMonth</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>fromDay</name>
            <codeName>FromDayListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">fromDay</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>toPort</name>
            <codeName>ToPortListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">toPort</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>toMonth</name>
            <codeName>ToMonthListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">toMonth</property>
                </properties>
            </identification>
        </object>
        <object type="ListBox" technology="Web">
            <name>toDay</name>
            <codeName>ToDayListBox</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">SELECT</property>
                    <property name="Name" type="string" isRegExp="false">toDay</property>
                </properties>
            </identification>
        </object>
        <object type="RadioGroup" technology="Web">
            <name>servClass</name>
            <codeName>ServClassRadioGroup</codeName>
            <identification>
                <properties>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Name" type="string" isRegExp="false">servClass</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
