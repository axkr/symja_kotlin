import org.matheclipse.core.expression.F.*
import org.matheclipse.core.basic.Config
import org.matheclipse.core.eval.ExprEvaluator
import org.matheclipse.core.eval.EvalEngine
import org.matheclipse.parser.client.SyntaxError
import org.matheclipse.parser.client.math.MathException
import org.matheclipse.kotlin.core.eval.*

fun main(args: Array<String>?) {
    try {

        val util = ExprEvaluator(false, 100)
        // allow assignments to System symbols like a, x
        EvalEngine.get().setPackageMode(true);

// Use this form to create an expression with F.* static methods:
        val function = 4 * x + Power(x, QQ(1, 2)) + Sin(x) * Cos(x) / ZZ(3)
        println("Differentiate function: ${function}")

        var result = util.evaluate(D(function, x))
// print: 4+1/(2*Sqrt(x))+Cos(x)^2/3-Sin(x)^2/3
        println("Result: ${result}")

        // assign a value to global ISymbol a
        result = util.evaluate(Set(a, ZZ(10)))
// print: 10
        System.out.println("Result a=10: ${result}")

// do a calculation with variable "a"
        result = util.evaluate(a * 3 + b)
// print: 30+b
        println("Result a*3+b: ${result}")

// Do a calculation in "numeric mode" with the N() function
        result = util.evaluate(N(Sinh(ZZ(5))))

// print: 74.20321057778875
        println("Result of N(Sinh(5)): ${result}")

// define a function with a recursive factorial function definition.
// Note: fac(0) is the stop condition.
        val fac = symbol("fac")
// fac(x_) := x * fac( x-1 )
        util.evaluate(SetDelayed(function(fac, x_), x * function(fac, x - 1)))
// fac(0) = 1
        util.evaluate(Set(function(fac, ZZ(0)), ZZ(1)))


// now calculate factorial of 10 with new defined function 'fac'
        result = util.evaluate(function(fac, ZZ(10)))
// print: 3628800
        println("Result of fac(10): ${result}")

    } catch (e: SyntaxError) {
// catch Symja parser errors here
        System.out.println(e.message)
    } catch (me: MathException) {
// catch Symja math errors here
        System.out.println(me.message)
    } catch (ex: Exception) {
        System.out.println(ex.message)
    } catch (soe: StackOverflowError) {
        System.out.println(soe.message)
    } catch (oome: OutOfMemoryError) {
        System.out.println(oome.message)
    }
}