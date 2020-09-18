package org.matheclipse.kotlin.core.eval

import org.matheclipse.core.interfaces.IExpr
import org.matheclipse.core.interfaces.ISymbol
import org.matheclipse.core.expression.F.*

operator fun ISymbol.plusAssign(other: IExpr) {  eval(binaryAST2(AddTo, this, other)) }

operator fun ISymbol.plusAssign(other: Int) {  eval(binaryAST2(AddTo, this, ZZ(other.toLong()))) }

operator fun ISymbol.minusAssign(other: IExpr) {  eval(binaryAST2(SubtractFrom, this, other)) }

operator fun ISymbol.minusAssign(other: Int) {  eval(binaryAST2(SubtractFrom, this, ZZ(other.toLong()))) }

operator fun ISymbol.timesAssign(other: IExpr) {  eval(binaryAST2(TimesBy, this, other)) }

operator fun ISymbol.timesAssign(other: Int) {  eval(binaryAST2(TimesBy, this, ZZ(other.toLong()))) }

operator fun ISymbol.divAssign(other: IExpr) {  eval(binaryAST2(DivideBy, this, other)) }

operator fun ISymbol.divAssign(other: Int) {  eval(binaryAST2(DivideBy, this, ZZ(other.toLong()))) }

operator fun ISymbol.remAssign(other: IExpr) {  eval(binaryAST2(Set, this, Mod(this, other))) }

operator fun ISymbol.remAssign(other: Int) {  eval(binaryAST2(Set, this, Mod(this, ZZ(other.toLong())))) }

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun IExpr.plus(other: Int) : IExpr = this.plus(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun Int.plus(other: IExpr) : IExpr = ZZ(this.toLong()).plus(other)

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun IExpr.times(other: Int) : IExpr = this.times(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun Int.times(other: IExpr) : IExpr = ZZ(this.toLong()).times(other)

/**
 * Enables the use of the operator [IExpr] `- IExpr`.
 */
operator fun IExpr.minus(other: IExpr) : IExpr = this.minus(other)

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun IExpr.minus(other: Int) : IExpr = this.minus(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun Int.minus(other: IExpr) : IExpr = ZZ(this.toLong()).minus(other)

/**
 * Enables the use of the operator [IExpr] `/ IExpr`.
 */
operator fun IExpr.div(other: IExpr) : IExpr = this.divide(other)

/**
 * Enables the use of the operator [IExpr] `% IExpr`.
 */
operator fun IExpr.rem(other: IExpr) : IExpr = this.mod(other)

/**
 * Enables the use of the operator [IExpr] `% IExpr`.
 */
operator fun IExpr.rem(other: Int) : IExpr = this.mod(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `% IExpr`.
 */
operator fun Int.rem(other: IExpr) : IExpr = ZZ(this.toLong()).mod(other)


fun pow(arg1 : Int, arg2: IExpr) : IExpr { return ZZ(arg1.toLong()).power(arg2) }

fun pow(arg1 : IExpr, arg2: Int) : IExpr { return arg1.power(ZZ(arg2.toLong())) }

fun eq(arg1 :IExpr, arg2: IExpr) : IExpr = Equal(arg1, arg2)

fun eq(arg1: Int, arg2: IExpr) : IExpr = Equal(ZZ(arg1.toLong()), arg2)

fun eq(arg1 :IExpr, arg2: Int) : IExpr = Equal(arg1, ZZ(arg2.toLong()))

fun ne(arg1 :IExpr, arg2: IExpr) : IExpr = Unequal(arg1, arg2)

fun ne(arg1: Int, arg2: IExpr) : IExpr = Unequal(ZZ(arg1.toLong()), arg2)

fun ne(arg1: IExpr, arg2: Int) : IExpr = Unequal(arg1, ZZ(arg2.toLong()))

fun ge(arg1: IExpr, arg2: IExpr) : IExpr = GreaterEqual(arg1, arg2)

fun ge(arg1: Int, arg2: IExpr) : IExpr = GreaterEqual(ZZ(arg1.toLong()), arg2)

fun ge(arg1 :IExpr, arg2: Int) : IExpr = GreaterEqual(arg1, ZZ(arg2.toLong()))

fun le(arg1 :IExpr, arg2: IExpr) : IExpr = LessEqual(arg1, arg2)

fun le(arg1: Int, arg2: IExpr) : IExpr = LessEqual(ZZ(arg1.toLong()), arg2)

fun le(arg1 :IExpr, arg2: Int) : IExpr = LessEqual(arg1, ZZ(arg2.toLong()))

fun gt(arg1 :IExpr, arg2: IExpr) : IExpr = Greater(arg1, arg2)

fun gt(arg1: Int, arg2: IExpr) : IExpr = Greater(ZZ(arg1.toLong()), arg2)

fun gt(arg1 :IExpr, arg2: Int) : IExpr = Greater(arg1, ZZ(arg2.toLong()))

fun lt(arg1 :IExpr, arg2: IExpr) : IExpr = Less(arg1, arg2)

fun lt(arg1 :Int, arg2: IExpr) : IExpr = Less(ZZ(arg1.toLong()), arg2)

fun lt(arg1 :IExpr, arg2: Int) : IExpr = Less(arg1, ZZ(arg2.toLong()))