package day14homework.ex3;

/**
 * @author MarkChern
 * date 2020/12/10 7:21
 */
public enum Payment implements Payable
{
    ALIPAY("扫码支付") ,
    WECAHT("扫码支付"), CREDIT_CARD("输入卡号支付"), DEPOSIT_CARD("输入卡号支付");

    private String payment;

    Payment(String payment)
    {
        this.payment = payment;
    }


    @Override
    public void pay()
    {
        System.out.println(payment);
    }
}
