/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.firefox.vpn.user.domain

import org.mozilla.firefox.vpn.user.data.AuthToken
import org.mozilla.firefox.vpn.user.data.UserRepository

class SaveAuthTokenUseCase(private val userRepository: UserRepository) {
    operator fun invoke(token: AuthToken) {
        userRepository.saveAuthToken(token)
    }
}
