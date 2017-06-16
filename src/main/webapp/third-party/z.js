window.undefined = window.undefined;
window.$E = function($) {
	return (typeof($) == "object" ? $: document.getElementById($))
};
window.$v = function(A, $) {
	var _ = $E(A);
	if (_) if (arguments.length == 2) {
		if (_.value !== undefined) _.value = $;
		else if (_.innerText !== undefined) _.innerText = $;
		else if (_.innerHTML !== undefined) _.innerHTML = $
	} else if (_.value !== undefined) return _.value;
	else return _.innerText || _.innerHTML;
	return null
};
String.prototype.toInt = function() {
	return Z.isEmpty(this) ? null: parseInt(this, 10)
};
String.prototype.toFloat = function() {
	return Z.isEmpty(this) ? null: parseFloat(this, 10)
};
String.prototype.removeHTML = function($) {
	return Z.removeHTML(this, $)
};
String.prototype.removeSCRIPT = function() {
	return Z.removeSCRIPT(this)
};
String.prototype.encodeSCRIPT = function() {
	return Z.encodeSCRIPT(this)
};
String.prototype.trim = function() {
	return this.replace(/(^\s*)|(\s*$)/g, "")
};
String.prototype.ltrim = function() {
	return this.replace(/(^\s*)/g, "")
};
String.prototype.rtrim = function() {
	return this.replace(/(\s*$)/g, "")
};
String.prototype.right = function($) {
	return $ >= this.length ? this: this.substr(this.length - $)
};
String.prototype.left = function($) {
	return this.substr(0, $)
};
String.prototype.mid = function($, _) {
	if (!_) _ = this.length;
	return this.substr($, _)
};
String.prototype.toggle = function(_, $) {
	return this == _ ? $: _
};
String.prototype.getByteLen = function() {
	return this.replace(/[^\x00-\xff]/g, "??").length
};
String.prototype.leftByte = function(_, $) {
	return Z.String.leftByte(this, _, $)
};
String.prototype.startWith = function(_, $) {
	return $ ? new RegExp(_ + "*", "i").test(this) : this.substr(0, _.length) == _
};
String.prototype.endWith = function(_, $) {
	var B = this.length,
	A = _.length;
	if (A > B) return false;
	if ($) return new RegExp(_ + "$", "i").test(this);
	else return (A == 0 || this.substr(B - A, A) == _)
};
String.prototype.remove = function(_, A) {
	var $ = "";
	if (_ > 0) $ = this.substring(0, _);
	if (_ + A < this.length) $ += this.substring(_ + A, this.length);
	return $
};
String.prototype.replaceAll = function(_, $) {
	return this.replace(new RegExp(_, "gm"), $)
};
String.prototype.replaceDeep = function(_, $) {
	var A = this.replaceAll(_, $);
	if (A.indexOf(_) == -1 || _ == $) return A;
	else return A.replaceDeep(_, $)
};
String.prototype.toIntPrefix = function() {
	var $ = "";
	for (var _ = 0; _ < this.length; _++) if ("1234567890".indexOf(this.charAt(_)) != -1) $ += this.charAt(_);
	else break;
	return $
};
String.prototype.toStringPostfix = function() {
	return this.replace(/(^\d*)/g, "")
};
String.prototype.leftPad = function(A, _) {
	var $ = String(this);
	if (!_) _ = " ";
	while ($.length < A) $ = _ + $;
	return $
};
String.prototype.rightPad = function(A, _) {
	var $ = String(this);
	if (!_) _ = " ";
	while ($.length < A) $ = $ + _;
	return $
};
String.prototype.toDate = function() {
	var B = this.split(/\D/gi);
	if (B.length < 3) {
		alert("ERROR:\u5b57\u7b26\u4e32\u65e5\u671f\u683c\u5f0f\u4e0d\u6b63\u786e");
		return null
	}
	var F = parseInt(B[0], 10),
	C = parseInt(B[1], 10) - 1,
	_ = parseInt(B[2], 10),
	E = B[3] ? parseInt(B[3], 10) : 0,
	D = B[4] ? parseInt(B[4], 10) : 0,
	A = B[5] ? parseInt(B[5], 10) : 0,
	$ = new Date(0);
	$.setFullYear(F);
	$.setMonth(C);
	$.setDate(_);
	$.setHours(E);
	$.setMinutes(D);
	$.setSeconds(A);
	return $
};
if (!String.prototype.format) String.prototype.format = function(B) {
	var A = arguments,
	_;
	if (A.length == 1 && Z.isArray(B)) _ = B;
	else if (A.length == 1 && Z.isObject(B)) {
		var $ = this;
		for (var D in B) $ = $.replaceAll("{" + D + "}", B[D]);
		return $
	} else _ = new Array();
	for (var C = 0; C < A.length; C++) _.push(A[C]);
	return this.replace(/\{(\d+)\}/g,
	function($, A) {
		return _[A]
	})
};
String.prototype.splitByNaN = function() {
	var $ = this.split(/\D/gi);
	for (var _ = 0; _ < $.length; _++) $[_] = parseInt($[_]);
	return $
};
Number.prototype.toDate = function() {
	return new Date(this)
};
Number.prototype.toInt = function() {
	return this
};
Number.prototype.toFloat = function() {
	return this
};
Date.prototype.fmt = function($) {
	return Z.Date.fmt(this, $)
};
Date.prototype.toDate = function() {
	return this
};
Date.prototype.toHT = function() {
	return Z.Date.toHT(this)
};
window.Z = {
	getTime: function() {
		return new Date().getTime()
	}
};
Z.apply = function(B, _, $) {
	if ($) Z.apply(B, $);
	if (B && _ && typeof _ == "object") for (var A in _) B[A] = _[A];
	return B
}; (function() {
	var A = Object.prototype.toString,
	_ = function($) {
		if (Z.isArray($) || $.callee) return true;
		if (/NodeList|HTMLCollection/.test(A.call($))) return true;
		return (($.nextNode || $.item) && Z.isNumber($.length))
	};
	Z.apply(Z, {
		ns: function $(B) {
			if (typeof(B) != "string" || !B) return;
			var _ = B.split("."),
			A = window;
			for (var C = 0; C < _.length; C++) A = A[_[C]] = A[_[C]] || {}
		},
		write: function(_) {
			var $ = document.createElement("div");
			$.innerHTML = _;
			document.body.appendChild($)
		},
		id: function($) {
			return typeof $ === "string" ? document.getElementById($) : $
		},
		name: function($) {
			return typeof $ === "string" ? document.getElementsByName($) : $
		},
		isEmpty: function($, _) {
			return $ === null || $ === undefined || ((Z.isArray($) && !$.length)) || (!_ ? $ === "": false)
		},
		isArray: function($) {
			return A.apply($) === "[object Array]"
		},
		isObject: function($) {
			return $ && typeof $ == "object"
		},
		isPrimitive: function($) {
			return Z.isString($) || Z.isNumber($) || Z.isBoolean($)
		},
		isFunction: function($) {
			return A.apply($) === "[object Function]"
		},
		isNumber: function($) {
			return typeof $ === "number" && isFinite($)
		},
		isString: function($) {
			return typeof $ === "string"
		},
		isBoolean: function($) {
			return typeof $ === "boolean"
		},
		isDate: function($) {
			return Object.prototype.toString.apply($) === "[object Date]"
		},
		isDefined: function($) {
			return typeof $ !== "undefined"
		},
		toString: function($) {
			if (!Z.isDefined($)) return "";
			else if (Z.isDate($)) return $.fmt("yyyy-M-d H:m:s");
			else return String($)
		},
		applyIf: function(A, $) {
			if (A) for (var _ in $) if (Z.isEmpty(A[_])) A[_] = $[_];
			return A
		},
		extend: function() {
			var _ = function($) {
				for (var _ in $) this[_] = $[_]
			},
			$ = Object.prototype.constructor;
			return function(E, D, C) {
				if (Z.isObject(D)) {
					C = D;
					D = E;
					E = C.constructor != $ ? C.constructor: function() {
						D.apply(this, arguments)
					}
				}
				var A = function() {},
				B,
				F = D.prototype;
				A.prototype = F;
				B = E.prototype = new A();
				B.constructor = E;
				E.superclass = F;
				if (F.constructor == $) F.constructor = D;
				E.override = function($) {
					Z.override(E, $)
				};
				B.superclass = B.supr = (function() {
					return F
				});
				B.override = _;
				Z.override(E, C);
				E.extend = function($) {
					Z.extend(E, $)
				};
				return E
			}
		} (),
		override: function(A, $) {
			if ($) {
				var _ = A.prototype;
				Z.apply(_, $);
				if (Z.isIE && $.toString != A.toString) _.toString = $.toString
			}
		},
		each: function(D, B, $) {
			if (Z.isEmpty(D, true)) return;
			if (!_(D) || Z.isPrimitive(D)) D = [D];
			for (var C = 0,
			A = D.length; C < A; C++) if (B.call($ || D[C], D[C], C, D) === false) return C
		},
		encodeURI: function($) {
			return encodeURIComponent($)
		},
		decodeURI: function($) {
			return decodeURIComponent($)
		},
		urlEncode: function(A, _) {
			var B, D = [],
			C,
			$ = encodeURIComponent;
			for (C in A) {
				B = !Z.isDefined(A[C]);
				Z.each(B ? C: A[C],
				function(_, A) {
					D.push("&", $(C), "=", (_ != C || !B) ? $(_) : "")
				})
			}
			if (!_) {
				D.shift();
				_ = ""
			}
			return _ + D.join("")
		},
		urlDecode: function(C, B) {
			var E = {},
			_ = C.split("&"),
			$ = decodeURIComponent,
			A,
			D;
			Z.each(_,
			function(_) {
				_ = _.split("=");
				A = $(_[0]);
				D = $(_[1]);
				E[A] = B || !E[A] ? D: [].concat(E[A]).concat(D)
			});
			return E
		},
		urlAppend: function(B, _, A) {
			var $;
			if (Z.isEmpty(_)) $ = B;
			else {
				if (Z.isObject(_)) _ = Z.urlEncode(_);
				$ = B + (B.indexOf("?") === -1 ? "?": "&") + _
			}
			if (A && $.indexOf("random") == -1) return $ + ($.indexOf("?") === -1 ? "?": "&") + "random=" + new Date().getTime();
			else return $
		}
	})
})();
Z.applyIf(Array.prototype, {
	indexOf: function($) {
		for (var A = 0,
		_ = this.length; A < _; A++) if (this[A] == $) return A;
		return - 1
	},
	remove: function(_) {
		var $ = this.indexOf(_);
		if ($ != -1) this.splice($, 1);
		return this
	}
}); (function() {
	var _ = navigator.userAgent.toLowerCase(),
	$; ($ = _.match(/msie ([\d.]+)/)) ? Z.isIE = $[1] : false; ($ = _.match(/firefox\/([\d.]+)/)) ? Z.isFireFox = $[1] : false; ($ = _.match(/chrome\/([\d.]+)/)) ? Z.isChrome = $[1] : false; ($ = _.match(/opera.([\d.]+)/)) ? Z.isOpera = $[1] : false; ($ = _.match(/version\/([\d.]+).*safari/)) ? Z.isSafari = $[1] : false
})();
Z.ns("Z.String");
Z.String.format = function($) {
	var A = arguments,
	_ = new Array();
	for (var B = 1; B < A.length; B++) _.push(A[B]);
	return $.format(_)
};
Z.String.leftByte = function($, B, A) {
	if (!$ || !B || B >= String($).getByteLen()) return $;
	if (A) {
		var _ = B - 3;
		while (C($, _).getByteLen() > _) _--;
		return C($, _) + "..."
	} else {
		while (C($, B).getByteLen() > B) B--;
		return C($, B)
	}
	function C($, _) {
		return $.replace(/([\u0391-\uffe5])/ig, "$1a").substring(0, _).replace(/([\u0391-\uffe5])a/ig, "$1")
	}
};
Z.ns("Z.Date");
Z.Date.parse = function($) {
	if (!$) {
		alert("ERROR:\u8f93\u5165\u7684\u65e5\u671f\u4e3a<\u7a7a>\u6216null\u503c!");
		return null
	} else if (typeof($) == "object" && $.getYear) return $;
	else if (typeof($) == "number") return new Date($);
	else if (typeof($) != "string") {
		alert("ERROR:\u8f93\u5165\u7684\u65e5\u671f\u683c\u5f0f\u4e0d\u6b63\u786e");
		return null
	} else return $.toDate()
};
Z.Date.fmt = function(F, B) {
	F = Z.Date.parse(F);
	if (!F) return null;
	if (!B) B = "yyyy-MM-dd HH:mm:ss";
	var H = String(F.getFullYear()),
	C = String(F.getMonth() + 1),
	$ = String(F.getDate()),
	E = String(F.getHours()),
	G = F.getHours(),
	A;
	if (G <= 6) A = "\u51cc\u6668";
	else if (G <= 11) A = "\u4e0a\u5348";
	else if (G == 12) A = "\u4e2d\u5348";
	else if (G <= 18) A = "\u4e0b\u5348";
	else if (G <= 22) A = "\u665a\u4e0a";
	else A = "\u6df1\u591c";
	if (G > 12) G = G - 12;
	G = String(G);
	var D = String(F.getMinutes()),
	_ = String(F.getSeconds());
	B = B.replace(/y{1,4}/ig,
	function(_, $) {
		return H.right(_.length)
	});
	B = B.replace(/M{1,2}/g,
	function(_, $) {
		return _.length == 1 ? C: C.leftPad(2, "0")
	});
	B = B.replace(/d{1,2}/ig,
	function(A, _) {
		return A.length == 1 ? $: $.leftPad(2, "0")
	});
	B = B.replace(/H{1,2}/g,
	function(_, $) {
		return _.length == 1 ? E: E.leftPad(2, "0")
	});
	B = B.replace(/h{1,2}/g,
	function(_, $) {
		return _.length == 1 ? G: G.leftPad(2, "0")
	});
	B = B.replace(/m{1,2}/g,
	function($) {
		return $.length == 1 ? D: D.leftPad(2, "0")
	});
	B = B.replace(/s{1,2}/ig,
	function($) {
		return $.length == 1 ? _: _.leftPad(2, "0")
	});
	B = B.replace(/tt/ig, A);
	return B
};
Z.addEvent = function(_, A, C, B) {
	_ = $E(_);
	if (_) {
		var $ = null;
		if (B) $ = function($) {
			C.call(B, $)
		};
		else $ = C;
		if (window.attachEvent) _.attachEvent("on" + A, $);
		else _.addEventListener(A, $, false)
	} else alert("\u53c2\u6570target\u65e0\u6548,\u8bf7\u68c0\u67e5!")
};
Z.removeEvent = function(A, $, _) {
	if (!A || !$ || $.trim().length < 4 || !Z.isFunction(_)) return;
	$ = $.toLowerCase().trim();
	if ($.startWith("on")) $ = $.right($.length - 2);
	if (window.removeEventListener) A.removeEventListener($, _, false);
	else A.detachEvent("on" + $, _)
};
Z.focus = function($) {
	var A = $E($);
	try {
		if (!A) {
			A = document.getElementsByName($);
			if (A && A.length > 0) A = A[0];
			else return
		}
		setTimeout(function() {
			A.focus();
			A.select()
		},
		200)
	} catch(_) {}
};
Z.HashTable = function() {
	this._hash = new Object();
	this.add = function(_, $) {
		if (typeof(_) != "undefined") {
			if (this.contains(_) == false) {
				this._hash[_] = (typeof($) == "undefined" ? null: $);
				return true
			} else return false
		} else return false
	};
	this.remove = function($) {
		delete this._hash[$]
	};
	this.count = function() {
		var _ = 0;
		for (var $ in this._hash) _++;
		return _
	};
	this.items = function($) {
		return this._hash[$]
	};
	this.contains = function($) {
		return typeof(this._hash[$]) != "undefined"
	};
	this.clear = function() {
		for (var $ in this._hash) delete this._hash[$]
	};
	this.keys = function() {
		var $ = new Array();
		for (var _ in this._hash) $.push(_);
		return $
	};
	this.toArray = function() {
		var $ = [];
		for (var _ in this._hash) $.push(this._hash[_]);
		return $
	}
};
window.__z_cmpHS = new Z.HashTable();
Z.getCmp = function($) {
	return window.__z_cmpHS.items(String($))
};
Z.setCmp = function($, _) {
	window.__z_cmpHS.add(String($), _)
};
Z.setJSON2UI = function(E, I, B, H, F) {
	if (Z.isEmpty(E)) return;
	else if (Z.isString(E)) {
		try {
			E = window.eval("(" + E + ")")
		} catch(A) {
			alert("Z.setJSON2UI\u65f6\u51fa\u5f02\u5e38,\u8bf7\u901a\u77e5\u7ba1\u7406\u5458!\r\njson=" + E);
			return
		}
	}
	F = F || {};
	var C = "value,innerText,innerHTML";
	if (!Z.isEmpty(F.p)) C = F.p + "," + C;
	I = Z.isArray(I) ? I: [];
	B = Z.isArray(B) ? B: [];
	H = Z.isDefined(H) ? H: true;
	var J = function(A, $) {
		for (var B = 0; B < A.length; B++) {
			var _ = A[B];
			if (_.f == $) {
				if (!Z.isDefined(_.t)) _.t = _.f;
				if (!Z.isDefined(_.p)) _.p = C;
				return _
			}
		}
		return {
			f: $,
			t: $,
			p: C,
			r: null
		}
	},
	G = function(C, $) {
		var E = C.p.split(","),
		_ = Z.id(C.t);
		if (C.eval) {
			if (Z.isFunction(C.r)) {
				_ = _ || Z.name(C.t);
				C.r($, Z.isEmpty(_) ? null: _)
			}
		} else if (!_ || _.type == "radio") {
			_ = Z.name(C.t);
			if (_.length > 0) {
				for (var D = 0; D < _.length; D++) {
					var B = _[D];
					if (B.value == (C.r ? C.r($) : $)) {
						B.checked = true;
						break
					}
				}
			} else if (H) alert("\u672a\u627e\u5230id=" + C.t + " \u7684Html Element\u5143\u7d20!")
		} else if (_.type == "checkbox") _.checked = C.r ? C.r($) : $;
		else if (_.tagName) for (D = 0; D < E.length; D++) {
			var A = E[D];
			if (Z.isString(_[A])) {
				_[A] = C.r ? C.r($) : $;
				break
			}
		}
	};
	for (var $ in E) if (E.hasOwnProperty($)) {
		if (B.indexOf($) != -1) continue;
		var D = E[$],
		_ = J(I, $);
		G(_, D)
	}
};
Z.getUI2Params = function(M, _, J, E) {
	try {
		var B = (M ? $E(M) : document),
		C = (_ ? _: {});
		if (!B) {
			alert("containerId=" + M + "\u7684\u5bb9\u5668\u5bf9\u8c61\u672a\u627e\u5230!");
			return C
		}
		var $ = B.getElementsByTagName("input");
		for (var G = 0; G < $.length; G++) {
			var I = $[G],
			F = I.type,
			H = I.id.trim();
			if (!H && F != "radio") continue;
			if (E && E.indexOf(H) != -1) continue;
			if (F == "text" || F == "password" || F == "hidden") C[H] = (J ? I.value.trim() : I.value);
			else if (F == "checkbox") C[H] = I.checked;
			else if (F == "radio") {
				var K = I.name;
				if (!K || E && E.indexOf(K) != -1) continue;
				if (C[K] !== undefined) continue;
				C[K] = "";
				var L = document.getElementsByName(K);
				for (var D = 0; D < L.length; D++) if (L[D].checked) {
					C[I.name] = L[D].value;
					break
				}
			}
		}
		$ = B.getElementsByTagName("select");
		for (G = 0; G < $.length; G++) {
			I = $[G],
			H = I.id.trim();
			if (!H || E && E.indexOf(H) != -1) continue;
			C[H] = (J ? I.value.trim() : I.value)
		}
		$ = B.getElementsByTagName("textarea");
		for (G = 0; G < $.length; G++) {
			I = $[G],
			H = I.id.trim();
			if (!H || E && E.indexOf(H) != -1) continue;
			C[H] = (J ? I.value.trim() : I.value)
		}
		return C
	} catch(A) {
		alert("function getUI2Params(...)\u51fd\u6570\u51fa\u9519\uff1a" + A.name + "->" + A.message)
	}
};
Z.getUI2Query = function(_) {
	var A = {};
	for (var E = 0; E < _.length; E++) {
		var $ = _[E],
		C = $E($);
		if (C && C.type != "radio") {
			if ((C.type == "checkbox" && C.checked) || (C.type != "checkbox" && C.value)) A[$] = C.type == "checkbox" ? C.checked: C.value.trim()
		} else {
			var B = document.getElementsByName($);
			for (var D = 0; D < B.length; D++) if (B[D].checked && B[D].value) {
				A[$] = B[D].value;
				break
			}
		}
	}
	return A
};
Z.openWindow = function() {
	var C = null,
	_ = arguments.length;
	if (_ == 0) return false;
	else C = arguments[0];
	var B = screen.availWidth - 10,
	A = screen.availHeight,
	D = 0,
	$ = 0;
	if (_ >= 2 && arguments[1] != null) {
		D = arguments[1];
		B = screen.availWidth - D * 2
	}
	if (_ >= 3 && arguments[2] != null) {
		$ = arguments[2];
		A = screen.availHeight - $ * 2
	}
	window.open(C, "", "menubar=no,toolbar=no,location=no,directories=no,status=no,scrollbars=yes,width=" + B + ",height=" + A + ",left=" + D + ",top=" + $ + ",resizable=yes");
	return false
};
Z.Url = {};
Z.Url.getParam = function($) {
	var D, B, A, _, C = window.location.href,
	G = C.indexOf("?"),
	F = C.substring(G + 1);
	if (!Z.isDefined($)) return Z.urlDecode(F);
	if (G <= 0) return null;
	if (C.indexOf("&") > 0) {
		D = F.split("&");
		for (var E = 0; E < D.length; E++) {
			_ = D[E];
			G = _.indexOf("=");
			if (G <= 0) return null;
			B = _.substring(0, G);
			A = (_.substring(G + 1) + "").split("#")[0];
			if (B.toUpperCase() == $.toUpperCase()) return Z.decodeURI(A)
		}
	} else {
		_ = F;
		G = _.indexOf("=");
		if (G <= 0) return null;
		B = _.substring(0, G);
		A = (_.substring(G + 1) + "").split("#")[0];
		if (B.toUpperCase() == $.toUpperCase()) return Z.decodeURI(A)
	}
	return null
};
Z.Url.reload = function() {
	document.location.href = document.location.href
};
Z.Url.go = function($) {
	document.location.href = $ + ($.indexOf("?") == -1 ? "?": "&") + "random=" + new Date().getTime()
};
Z.onkeypressInt = function(_) {
	var B, A, $;
	if (window.event) B = _.keyCode;
	else if (_.which) B = _.which;
	if (!B || B == 8) return true;
	A = String.fromCharCode(B);
	$ = /^[0-9]*$/;
	return $.test(A)
};
if (Z.isFireFox) {
	HTMLElement.prototype.__defineGetter__("innerText",
	function() {
		var $ = "",
		_ = this.childNodes;
		for (var A = 0; A < _.length; A++) if (_[A].nodeType == 1) $ += _[A].tagName == "BR" ? "\n": _[A].innerText;
		else if (_[A].nodeType == 3) $ += _[A].nodeValue;
		return $
	});
	HTMLElement.prototype.__defineSetter__("innerText",
	function($) {
		this.textContent = $
	})
}
if (Z.isFireFox) HTMLElement.prototype.__defineGetter__("children",
function() {
	var $ = new Object(),
	_ = 0;
	for (var A = 0; A < this.childNodes.length; A++) if (this.childNodes[A].nodeType == 1) {
		$[_] = this.childNodes[A];
		_++
	}
	$.length = _;
	return $
});
if (Z.isFireFox) {
	HTMLElement.prototype.__defineGetter__("outerHTML",
	function() {
		var _ = this.attributes,
		$ = "<" + this.tagName,
		A = 0;
		for (; A < _.length; A++) if (_[A].specified) $ += " " + _[A].name + "=\"" + _[A].value + "\"";
		if (!this.canHaveChildren) return $ + " />";
		return $ + ">" + this.innerHTML + "</" + this.tagName + ">"
	});
	HTMLElement.prototype.__defineSetter__("outerHTML",
	function(_) {
		var A = this.ownerDocument.createRange();
		A.setStartBefore(this);
		var $ = A.createContextualFragment(_);
		this.parentNode.replaceChild($, this);
		return _
	});
	HTMLElement.prototype.__defineGetter__("canHaveChildren",
	function() {
		return ! /^(area|base|basefont|col|frame|hr|img|br|input|isindex|link|meta|param)$/.test(this.tagName.toLowerCase())
	})
}
Z.ns("Z.Ajax");
Z.Ajax.request = function(A) {
	function E() {
		var _, A = ["MSXML2.XMLHTTP.3.0", "MSXML2.XMLHTTP", "Microsoft.XMLHTTP"];
		try {
			_ = new XMLHttpRequest()
		} catch($) {
			for (var B = 0; B < A.length; ++B) {
				try {
					_ = new ActiveXObject(A[B]);
					break
				} catch($) {}
			}
		} finally {
			return _
		}
	}
	var D = A.url,
	C = A.params,
	B = A.method;
	if (!Z.isDefined(A.method)) B = Z.isDefined(C) ? "POST": "GET";
	if (C) if (B == "GET") {
		D = Z.urlAppend(D, Z.urlEncode(C));
		C = null
	} else C = Z.urlEncode(C);
	D += (D.indexOf("?") > 0 ? "&": "?") + "randnum=" + new Date().getTime();
	var _ = E();
	_.onreadystatechange = function() {
		if (_.readyState == 4) if (A.callback) A.callback(A, _.status == 200, _)
	};
	_.open(B, D, !A.sync);
	_.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	_.send(C || null);
	if (A.sync) if (_.responseText != "") {
		try {
			return evel("(" + _.responseText + ")")
		} catch($) {
			return _.responseText
		}
	} else return null
};
Z.getFileSize = function($, _) {
	if (_ != 0 && !_) _ = 2;
	if ($ < 1024) return $ + "Byte";
	else if ($ < 1048576) return A($ / (1024) - 0.005, _) + "KB";
	else if ($ < 1073741824) return A($ / (1048576) - 0.005, _) + "MB";
	else return A($ / (1073741824) - 0.005, _) + "GB";
	function A(_, A) {
		var $ = Math.round(_ * Math.pow(10, A)) / Math.pow(10, A),
		B = String($).split(".");
		if (B[0].length > 3) return B[0];
		else return $
	}
};
Z.setCookie = function(A, C, _) {
	var B = !_ ? 30 : _,
	$ = new Date();
	$.setTime($.getTime() + B * 24 * 60 * 60 * 1000);
	document.cookie = A + "=" + escape(C) + ";expires=" + $.toGMTString()
};
Z.getCookie = function(_) {
	var $ = document.cookie.match(new RegExp("(^| )" + _ + "=([^;]*)(;|$)"));
	if ($ != null) return unescape($[2]);
	return null
};
Z.delCookie = function(A, B) {
	var $ = new Date();
	$.setTime($.getTime() - 1000 * 3600 * 24 * 365);
	var C = Z.getCookie(A);
	if (C != null) {
		var _ = A + "=null;expires=" + $.toGMTString();
		if (B) _ += ";path=" + B;
		document.cookie = _
	}
};
Z.getEvent = function() {
	if (Z.isIE) return window.event;
	var _ = Z.getEvent.caller;
	while (_ != null) {
		var $ = _.arguments[0];
		if ($) if (($.constructor == Event || $.constructor == MouseEvent) || (typeof($) == "object" && $.preventDefault && $.stopPropagation)) return $;
		_ = _.caller
	}
	return null
};
Z.getEventTarget = function($) {
	$ = $ ? $: Z.getEvent();
	return $.srcElement || $.target
};
Z.cancelBubble = function($) {
	$ = $ ? $: Z.getEvent();
	if (Z.isBoolean($.cancelBubble)) {
		$.cancelBubble = true;
		return true
	}
	return false
};
Z.stopPropagation = function($) {
	return Z.cancelBubble($)
};
Z.preventDefault = function($) {
	$ = $ ? $: Z.getEvent();
	if (Z.isFunction($.preventDefault)) $.preventDefault();
	else $.returnValue = false
};
Z.stopEvent = function($) {
	$ = $ ? $: Z.getEvent();
	Z.cancelBubble($);
	Z.preventDefault($)
};
Z.disp = function(A, $, _) {
	if (Z.isArray(A)) {
		for (var C = 0; C < A.length; C++) B(A[C], $, _)
	} else B(A, $, _);
	function B($, _, A) {
		$ = $E($);
		if (!Z.isObject($) || !$.style) {
			alert("Z.disp\u7684\u7b2c\u4e00\u4e2a\u53c2\u6570\u65e0\u6548 \u6216 \u627e\u4e0d\u5230\u8be5\u5143\u7d20,\u8bf7\u68c0\u67e5\u8c03\u7528\u4ee3\u7801!id=" + $);
			return
		}
		if (Z.isString(A)) A = A.toLowerCase().replaceAll(";", "").replaceAll(" ", "");
		else A = "";
		if (Z.isBoolean(_)) $.style.display = _ ? A: "none";
		else if ($.style.display.toLowerCase() == A) $.style.display = "none";
		else $.style.display = A
	}
};
Z.openMaxWindow = function(D, A) {
	var $ = screen.availWidth,
	E = screen.availHeight,
	B = 0,
	_ = 0;
	if (!Z.isDefined(A) || A == null) A = "maxWin" + Z.getTime();
	var C = window.open(D, A, "menubar=no,toolbar=no,location=no,directories=no,status=no,scrollbars=yes,width=" + $ + ",height=" + E + ",left=" + B + ",top=" + _ + ",resizable=yes");
	if (!C) {
		alert("\u4f60\u7684\u6d4f\u89c8\u5668\u62e6\u622a\u4e86\u5f39\u51fa\u7a97,\u9875\u9762\u65e0\u6cd5\u6253\u5f00!");
		return null
	}
	if (Z.isIE) C.resizeTo(screen.availWidth + 8, screen.availHeight + 8);
	else {
		C.outerHeight = screen.availHeight + 8;
		C.outerWidth = screen.availWidth + 8
	}
	return C
};
Z.nextSibling = function(_) {
	_ = $E(_);
	if (Z.isFireFox) {
		var $ = _.nextSibling;
		while ($.nodeType != 1) $ = $.nextSibling;
		return $
	} else {
		$ = _.nextSibling;
		while ($) if ($.nodeName != "#text") break;
		else $ = $.nextSibling;
		return $
	}
};
Z.previousSibling = function(_) {
	_ = $E(_);
	if (Z.isFireFox) {
		var $ = _.previousSibling;
		while ($ != null && $.nodeType != 1) $ = $.previousSibling;
		return $
	} else {
		$ = _.previousSibling;
		while ($) if ($.nodeName != "#text") break;
		else $ = $.previousSibling;
		return $
	}
};
Z.importJS = function(B, $) {
	if (Z.isArray(B) && B.length > 0) {
		var C = 0,
		_ = function() {
			if ($) $(C);
			C++;
			if (C < B.length) A(B[C], _)
		};
		A(B[C], _)
	} else A(B, $);
	function A(G, B) {
		var _ = arguments.callee.caller;
		if (typeof _ == "function") {
			var F = document.getElementsByTagName("head")[0],
			E = F.childNodes;
			for (var I = 0; I < E.length; I++) {
				var $ = E[I],
				C = $.nodeName.toUpperCase();
				if (C == "SCRIPT" && D($, "src") == G || C == "LINK" && D($, "href") == G) {
					alert("\u91cd\u590d\u52a0\u8f7d" + G);
					return
				}
			}
			var A = document.getElementsByTagName("head")[0].appendChild(document.createElement("script"));
			if (B) if (Z.isIE) A.onreadystatechange = H;
			else A.onload = H;
			A.type = "text/javascript";
			A.src = G
		}
		function H() {
			if (Z.isIE) {
				if (this.readyState == "loaded") B()
			} else B()
		}
		function D(B, $) {
			try {
				var A = B.attributes.getNamedItem,
				C = B.attributes.getNamedItem($);
				return (A && C ? C.nodeValue: null)
			} catch(_) {
				alert("getNV Error,please call sky.he!")
			}
		}
	}
};
Z.importCSS = function(B, $) {
	if (Z.isArray(B) && B.length > 0) {
		var C = 0,
		_ = function() {
			if ($) $(C);
			C++;
			if (C < B.length) A(B[C], _)
		};
		A(B[C], _)
	} else A(B, $);
	function A(G, A) {
		var _ = arguments.callee.caller;
		if (typeof _ == "function") {
			var F = document.getElementsByTagName("head")[0],
			E = F.childNodes;
			for (var I = 0; I < E.length; I++) {
				var $ = E[I],
				B = $.nodeName.toUpperCase();
				if (B == "SCRIPT" && C($, "src") == G || B == "LINK" && C($, "href") == G) {
					alert("\u91cd\u590d\u52a0\u8f7d" + G);
					return
				}
			}
			var D = document.getElementsByTagName("head")[0].appendChild(document.createElement("link"));
			D.type = "text/css";
			D.rel = "stylesheet";
			if (A) {
				if (Z.isIE) {
					D.onreadystatechange = H;
					D.href = G
				} else {
					D.onload = H;
					D.href = G;
					A()
				}
			} else D.href = G
		}
		function H() {
			if (Z.isIE) {
				if (this.readyState == "complete") A()
			} else A()
		}
		function C(B, $) {
			try {
				var A = B.attributes.getNamedItem,
				C = B.attributes.getNamedItem($);
				return (A && C ? C.nodeValue: null)
			} catch(_) {
				alert("getNV Error,please call sky.he!")
			}
		}
	}
};
Z.htmlEncode = function($) {
	return ! $ ? $: String($).replace(/&/g, "&amp;").replace(/>/g, "&gt;").replace(/</g, "&lt;").replace(/"/g, "&quot;").replace(/'/g, "&#39;").replace(/\\/g, "&#92;").replace(/\r/g, "&#13;").replace(/\n/g, "&#10;").replace(/\t/g, "&#9;")
};
Z.htmlDecode = function($) {
	return ! $ ? $: String($).replace(/&gt;/g, ">").replace(/&lt;/g, "<").replace(/&quot;/g, "\"").replace(/&#39;/g, "'").replace(/&amp;/g, "&").replace(/&#92;/g, "\\").replace(/&#13;/g, "\r").replace(/&#10;/g, "\n").replace(/&#9;/g, "\t")
};
Z.htmlEncodeAll = function($) {
	var _ = [];
	for (i = 0; i < $.length; i++) _[i] = $.charCodeAt(i);
	return "&#" + _.join(";&#") + ";"
};
Z.htmlGB2132 = function($) {
	var _ = [];
	for (i = 0; i < $.length; i++) {
		var A = $.charCodeAt(i);
		if (A <= 255 || (A >= 13312 && A <= 19893) || (A >= 19968 && A <= 40869) || (A >= 40870 && A <= 40891) || (A >= 63744 && A <= 64045) || (A >= 64048 && A <= 64106) || (A >= 64112 && A <= 64217) || (A >= 131072 && A <= 173782) || (A >= 194560 && A <= 195101) || (A >= 65280 && A <= 65519) || (A >= 12288 && A <= 12351) || (A >= 65040 && A <= 65055) || (A >= 65072 && A <= 65103) || (A == 8212 || A == 8220 || A == 8221 || A == 8230)) _[i] = $.charAt(i);
		else _[i] = "&#" + $.charCodeAt(i) + ";"
	}
	return _.join("")
};
Z.htmlDecodeAll = function($) {
	return $.replace(/&#(x)?([^&]{1,5});?/g,
	function(A, $, _) {
		return String.fromCharCode(parseInt(_, $ ? 16 : 10))
	})
};
Z.removeSCRIPT = function($) {
	return $.replace(/(<script[^>]*>)(.*?)(<\/script>)/ig, "")
};
Z.encodeSCRIPT = function($) {
	var _ = /(<script[^>]*>)(.*?)(<\/script>)/ig;
	return $.replace(_,
	function($, A, _) {
		return $.replace(/<(.*?)>/g, "&lt;$1&gt;") + A + _.replace(/<(.*?)>/g, "&lt;$1&gt;")
	})
};
Z.removeHTML = function(_, $) {
	if ($) {
		_ = _.replace(/ /g, "");
		_ = _.replace(/��/g, "")
	}
	_ = _.replace(/\r/g, "");
	_ = _.replace(/\n/g, "");
	_ = _.replace(/\t/g, "");
	_ = _.replace(/<(.*?)>/g, "");
	_ = _.replace(/&.{2,5}/g, "");
	return _
};
Z.Unicode = {
	on: function($) {
		var _ = [];
		for (i = 0; i < $.length; i++) _[i] = ("00" + $.charCodeAt(i).toString(16)).slice( - 4);
		return "\\u" + _.join("\\u")
	},
	un: function($) {
		return unescape($.replace(/\\/g, "%"))
	}
};
Z.getImgSize = function(B, A, _) {
	B = $E(B);
	var $ = B.width,
	C = B.height;
	if ($ / C >= A / _) return $ >= A ? {
		width: A,
		height: Math.round((C * A) / $)
	}: {
		width: $,
		height: C
	};
	else return C >= _ ? {
		height: _,
		width: Math.round(($ * _) / C)
	}: {
		width: $,
		height: C
	}
};
Z.limitImg = function(B, I, J, D, _, $, F) {
	B = $E(B);
	_ = $E(_);
	Z.disp(B, false);
	if (_) Z.disp(_, true);
	if (!Z.isDefined(F)) F = true;
	var H, G, A = 100,
	E = new Image(),
	C = function() {
		Z.removeEvent(E, "load", C);
		var L = 0,
		K = 0;
		H = E.width;
		G = E.height;
		if (!H || !G) {
			alert("image's width or height=0 ?");
			return
		}
		if (H / G >= J / D) {
			if (H > J) {
				L = J;
				K = (G * J) / H;
				A = Math.round(J / H * 100);
				if (!F) {
					B.width = L;
					B.height = K
				}
			} else if (!F) {
				B.width = H;
				B.height = G
			}
		} else if (G > D) {
			K = D;
			L = (H * D) / G;
			A = Math.round(D / G * 100);
			if (!F) {
				B.height = K;
				B.width = L
			}
		} else if (!F) {
			B.width = H;
			B.height = G
		}
		if (_) Z.disp(_, false);
		if (F) {
			if (K + L > 0) {
				E.width = L;
				E.height = K
			}
			E.id = B.id;
			E.alt = B.alt;
			E.title = B.title;
			Z.replaceChild(E, B)
		} else {
			B.src = I;
			Z.disp(B, true);
			B.alt = B.alt || (H + "x" + G)
		}
		if (Z.isFunction($)) $({
			"zoom": A,
			"width": H,
			"height": G,
			"image": (F ? E: null)
		})
	};
	Z.addEvent(E, "load", C);
	E.src = I
};
Z.removeNode = function($) {
	$ = $E($);
	if ($ && $.parentNode) $.parentNode.removeChild($)
};
Z.removeChild = function($) {
	$ = $E($);
	if ($ && $.childNodes && $.childNodes.length > 0) {
		var B = $.tagName.toUpperCase();
		if (["TBODY", "TABLE", "TR"].indexOf(B) == -1) {
			try {
				$.innerHTML = ""
			} catch(A) {
				alert("\u6267\u884cid.innerHTML = \"\"\u5931\u8d25\uff0c\u8bf7\u901a\u77e5sky.he");
				return
			}
		} else {
			var _ = rowWrap.childNodes,
			C = [];
			for (var D = 0; D < _.length; D++) C.push(_[D]);
			Z.each(C,
			function($) {
				Z.removeNode($)
			})
		}
	}
};
Z.replaceChild = function($, _) {
	$ = $E($);
	_ = $E(_);
	if (!$ || !_ || !_.parentNode) return;
	else _.parentNode.replaceChild($, _)
};
Z.removeEmpty = function(_) {
	if (!Z.isObject(_)) return _;
	var $ = [];
	for (var A in _) if (_.hasOwnProperty(A) && Z.isEmpty(_[A])) $.push(A);
	Z.each($,
	function($) {
		delete _[$]
	});
	return _
};
Z.ajax = function(C, B, $) {
	var A = !Z.isFunction($),
	_;
	if (C.indexOf(".ajax?action") == -1) C = "1.ajax?action=" + C;
	Z.Ajax.request({
		url: C,
		params: B,
		sync: A,
		callback: function(D, C, B) {
			_ = B.responseText;
			if (!A) $(_, C, D)
		}
	});
	if (A) return _
};
Z.setCursor = function($, A) {
	A = A || 99999;
	$ = $E($);
	if ($ && $.createTextRange) {
		var _ = $.createTextRange();
		_.moveStart("character", A);
		_.select();
		_.collapse(true)
	} else if ($ && $.setSelectionRange) $.setSelectionRange(A, A)
};
Z.decode = function($) {
	if ($ === undefined || $ === null || $.trim() === "") return null;
	else return Z.isObject($) ? $: window.eval("(" + $ + ")")
};
Z.JSON = new(function() {
	var D = !!{}.hasOwnProperty,
	A = function() {
		var $ = null;
		return function() {
			if ($ === null) $ = Z.USE_NATIVE_JSON && window.JSON && JSON.toString() == "[object JSON]";
			return $
		}
	} (),
	$ = function($) {
		return $ < 10 ? "0" + $: $
	},
	B = function(F) {
		if (!Z.isDefined(F) || F === null) return "null";
		else if (Z.isArray(F)) return E(F);
		else if (Z.isDate(F)) return Z.JSON.encodeDate(F);
		else if (Z.isString(F)) return _(F);
		else if (typeof F == "number") return isFinite(F) ? String(F) : "null";
		else if (Z.isBoolean(F)) return String(F);
		else {
			var C = ["{"],
			A,
			G,
			$;
			for (G in F) if (!F.getElementsByTagName) if (!D || F.hasOwnProperty(G)) {
				$ = F[G];
				switch (typeof $) {
				case "undefined":
				case "function":
				case "unknown":
					break;
				default:
					if (A) C.push(",");
					C.push(B(G), ":", $ === null ? "null": B($));
					A = true
				}
			}
			C.push("}");
			return C.join("")
		}
	},
	C = {
		"\b": "\\b",
		"\t": "\\t",
		"\n": "\\n",
		"\f": "\\f",
		"\r": "\\r",
		"\"": "\\\"",
		"\\": "\\\\"
	},
	_ = function($) {
		if (/["\\\x00-\x1f]/.test($)) return "\"" + $.replace(/([\x00-\x1f\\"])/g,
		function(A, $) {
			var _ = C[$];
			if (_) return _;
			_ = $.charCodeAt();
			return "\\u00" + Math.floor(_ / 16).toString(16) + (_ % 16).toString(16)
		}) + "\"";
		return "\"" + $ + "\""
	},
	E = function(B) {
		var A = ["["],
		_,
		D,
		C = B.length,
		$;
		for (D = 0; D < C; D += 1) {
			$ = B[D];
			switch (typeof $) {
			case "undefined":
			case "function":
			case "unknown":
				break;
			default:
				if (_) A.push(",");
				A.push($ === null ? "null": Z.encode($));
				_ = true
			}
		}
		A.push("]");
		return A.join("")
	};
	this.encodeDate = function($) {
		return $.fmt("\"" + $.fmt("yyyy-MM-dd HH:mm:ss") + "\"")
	};
	this.encode = function() {
		var $;
		return function(_) {
			if (!$) $ = A() ? JSON.stringify: B;
			return $(_)
		}
	} ()
})();
Z.encode = Z.JSON.encode;
Z.showMsg = function(E, C) {
	if (!$) {
		alert("Z.showMsg\u65b9\u6cd5\u9700\u8981jQuery\u5e93\u652f\u6301,\u8bf7\u5f15\u5165jQuery");
		return
	}
	Z.showMsg.zIndex = Z.showMsg.zIndex ? Z.showMsg.zIndex + 1 : 99900;
	var _ = "showmsg" + parseInt(Math.random() * 10000),
	B = ("<div id=\"{0}\" class=\"z-showmsg\" style=\"display:none\"><div class=\"wrap\">" + E + "</div></div>").format(_),
	A = $(window),
	D = $(B).prependTo("body");
	C = Z.isObject(C) ? C: {};
	C.delay = Z.isDefined(C.delay) ? C.delay: 2000;
	var F = 0;
	if (Z.isIE && Z.isIE <= 6) F = A.scrollTop() + ((A.height() - D.outerHeight()) / 2);
	else F = Math.round((A.height() - D.height()) / 2);
	D.css("z-index", Z.showMsg.zIndex).css("top", F).css("left", (A.width() - D.width()) / 2).fadeIn("fast").delay(C.delay).fadeOut("slow",
	function() {
		$(this).remove();
		Z.isFunction(C.closeEvent) && C.closeEvent()
	});
	return _
};
Z.UserData = {
	EL: null,
	name: location.hostname,
	init: function() {
		if (!Z.UserData.EL) {
			try {
				Z.UserData.EL = document.createElement("INPUT");
				Z.UserData.EL.type = "hidden";
				Z.UserData.EL.style.display = "none";
				Z.UserData.EL.addBehavior("#default#userData");
				document.body.appendChild(Z.UserData.EL);
				var _ = new Date();
				_.setDate(_.getDate() + 365);
				Z.UserData.EL.expires = _.toUTCString()
			} catch($) {
				return false
			}
		}
		return true
	},
	setItem: function(_, $) {
		if (Z.UserData.init()) {
			Z.UserData.EL.load(Z.UserData.name);
			Z.UserData.EL.setAttribute(_, $);
			Z.UserData.EL.save(Z.UserData.name)
		}
	},
	getItem: function($) {
		if (Z.UserData.init()) {
			Z.UserData.EL.load(Z.UserData.name);
			return Z.UserData.EL.getAttribute($)
		}
	},
	remove: function($) {
		if (Z.UserData.init()) {
			Z.UserData.EL.load(Z.UserData.name);
			Z.UserData.EL.removeAttribute($);
			Z.UserData.EL.save(Z.UserData.name)
		}
	}
};
Z.LocalStore = {
	get: function($) {
		$ = String($);
		return ! window.localStorage ? Z.UserData.getItem($) : localStorage.getItem($)
	},
	set: function(_, $) {
		_ = String(_); ! window.localStorage ? Z.UserData.setItem(_, $) : localStorage.setItem(_, $)
	},
	remove: function($) {
		$ = String($); ! window.localStorage ? Z.UserData.remove($) : localStorage.removeItem($)
	}
}