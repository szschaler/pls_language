<?xml version="1.0" encoding="UTF-8"?>
<pls:ProductionLineModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:pls="https://inf.kcl.ac.uk/models/pls">
  <machines xsi:type="pls:GenHandle" out="//@containers.0"/>
  <machines xsi:type="pls:GenHead" out="//@containers.1"/>
  <machines xsi:type="pls:Assembler" out="//@containers.3" in="//@containers.2"/>
  <containers xsi:type="pls:Conveyor" name="" tray="//@containers.2">
  	<parts xsi:type="pls:Handle"/>
  </containers>
  <containers xsi:type="pls:Conveyor" tray="//@containers.2"/>
  <containers xsi:type="pls:Tray"/>
  <containers xsi:type="pls:Conveyor" name=""/>
</pls:ProductionLineModel>
