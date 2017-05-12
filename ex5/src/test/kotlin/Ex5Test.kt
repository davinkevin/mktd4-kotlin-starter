package io.monkeypatch.mktd4.ex5

import org.junit.Assert
import org.junit.Test

class Ex5Test {


    @Test fun testUseLazy() {
        var initialized = false
        val lazyProperty = LazyProperty({ initialized = true; 42 })
        Assert.assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazy
        Assert.assertTrue("Property should be initialized after access", initialized)
        Assert.assertEquals(42, result)
    }

    @Test fun testLazyShouldBeInitializedOnce() {
        var initialized = 0
        val lazyProperty = LazyProperty({ initialized++; 42 })
        lazyProperty.lazy
        lazyProperty.lazy
        Assert.assertEquals("Lazy property should be initialized once", 1, initialized)

    }

    @Test fun testUseDelegate() {
        var initialized = false
        val lazyProperty = DelegateProperty({ initialized = true; 42 })
        Assert.assertFalse("Property shouldn't be initialized before access", initialized)
        val result: Int = lazyProperty.lazyValue
        Assert.assertTrue("Property should be initialized after access", initialized)
        Assert.assertEquals(42, result)
    }

    @Test fun testDelegateShouldBeInitializedOnce() {
        var initialized = 0
        val lazyProperty = DelegateProperty({ initialized++; 42 })
        lazyProperty.lazyValue
        lazyProperty.lazyValue
        Assert.assertEquals("Lazy property should be initialized once", 1, initialized)
    }


}