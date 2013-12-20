//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.26 at 02:14:30 PM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for BasePrepayRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasePrepayRule">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRule">
 *       &lt;sequence>
 *         &lt;element name="DateType" type="{}EnumDateType"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WeekSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeRule" type="{}EnumPrepayChangeRule"/>
 *         &lt;element name="CashScaleFirstAfter" type="{}EnumPrepayCutPayment"/>
 *         &lt;element name="CashScaleFirstBefore" type="{}EnumPrepayCutPayment"/>
 *         &lt;element name="DateNum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeductFeesAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeductFeesBefore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeductNumAfter" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DeductNumBefore" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Hour2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePrepayRule", propOrder = {
    "dateType",
    "startDate",
    "endDate",
    "weekSet",
    "changeRule",
    "cashScaleFirstAfter",
    "cashScaleFirstBefore",
    "dateNum",
    "time",
    "deductFeesAfter",
    "deductFeesBefore",
    "deductNumAfter",
    "deductNumBefore",
    "hour",
    "hour2"
})
@XmlSeeAlso({
    PrepayRule.class
})
public class BasePrepayRule
    extends BaseRule
{

    @JSONField(name = "DateType")
    protected EnumDateType dateType;
    @JSONField(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date startDate;
    @JSONField(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date endDate;
    @JSONField(name = "WeekSet")
    protected String weekSet;
    @JSONField(name = "ChangeRule")
    protected EnumPrepayChangeRule changeRule;
    @JSONField(name = "CashScaleFirstAfter")
    protected EnumPrepayCutPayment cashScaleFirstAfter;
    @JSONField(name = "CashScaleFirstBefore")
    protected EnumPrepayCutPayment cashScaleFirstBefore;
    @JSONField(name = "DateNum")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date dateNum;
    @JSONField(name = "Time")
    protected String time;
    @JSONField(name = "DeductFeesAfter")
    protected int deductFeesAfter;
    @JSONField(name = "DeductFeesBefore")
    protected int deductFeesBefore;
    @JSONField(name = "DeductNumAfter")
    protected BigDecimal deductNumAfter;
    @JSONField(name = "DeductNumBefore")
    protected BigDecimal deductNumBefore;
    @JSONField(name = "Hour")
    protected int hour;
    @JSONField(name = "Hour2")
    protected int hour2;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumDateType }
     *     
     */
    public EnumDateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDateType }
     *     
     */
    public void setDateType(EnumDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setStartDate(java.util.Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEndDate(java.util.Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the weekSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekSet() {
        return weekSet;
    }

    /**
     * Sets the value of the weekSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekSet(String value) {
        this.weekSet = value;
    }

    /**
     * Gets the value of the changeRule property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPrepayChangeRule }
     *     
     */
    public EnumPrepayChangeRule getChangeRule() {
        return changeRule;
    }

    /**
     * Sets the value of the changeRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPrepayChangeRule }
     *     
     */
    public void setChangeRule(EnumPrepayChangeRule value) {
        this.changeRule = value;
    }

    /**
     * Gets the value of the cashScaleFirstAfter property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPrepayCutPayment }
     *     
     */
    public EnumPrepayCutPayment getCashScaleFirstAfter() {
        return cashScaleFirstAfter;
    }

    /**
     * Sets the value of the cashScaleFirstAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPrepayCutPayment }
     *     
     */
    public void setCashScaleFirstAfter(EnumPrepayCutPayment value) {
        this.cashScaleFirstAfter = value;
    }

    /**
     * Gets the value of the cashScaleFirstBefore property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPrepayCutPayment }
     *     
     */
    public EnumPrepayCutPayment getCashScaleFirstBefore() {
        return cashScaleFirstBefore;
    }

    /**
     * Sets the value of the cashScaleFirstBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPrepayCutPayment }
     *     
     */
    public void setCashScaleFirstBefore(EnumPrepayCutPayment value) {
        this.cashScaleFirstBefore = value;
    }

    /**
     * Gets the value of the dateNum property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getDateNum() {
        return dateNum;
    }

    /**
     * Sets the value of the dateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setDateNum(java.util.Date value) {
        this.dateNum = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the deductFeesAfter property.
     * 
     */
    public int getDeductFeesAfter() {
        return deductFeesAfter;
    }

    /**
     * Sets the value of the deductFeesAfter property.
     * 
     */
    public void setDeductFeesAfter(int value) {
        this.deductFeesAfter = value;
    }

    /**
     * Gets the value of the deductFeesBefore property.
     * 
     */
    public int getDeductFeesBefore() {
        return deductFeesBefore;
    }

    /**
     * Sets the value of the deductFeesBefore property.
     * 
     */
    public void setDeductFeesBefore(int value) {
        this.deductFeesBefore = value;
    }

    /**
     * Gets the value of the deductNumAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductNumAfter() {
        return deductNumAfter;
    }

    /**
     * Sets the value of the deductNumAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductNumAfter(BigDecimal value) {
        this.deductNumAfter = value;
    }

    /**
     * Gets the value of the deductNumBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductNumBefore() {
        return deductNumBefore;
    }

    /**
     * Sets the value of the deductNumBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductNumBefore(BigDecimal value) {
        this.deductNumBefore = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Gets the value of the hour2 property.
     * 
     */
    public int getHour2() {
        return hour2;
    }

    /**
     * Sets the value of the hour2 property.
     * 
     */
    public void setHour2(int value) {
        this.hour2 = value;
    }

}
